layui.extend({
    admin: '{/}../../static/js/admin'
});

layui.use(['jquery', 'table', 'form', 'admin', 'layer'], function () {
    var $ = layui.jquery,
        table = layui.table,
        form = layui.form,
        admin = layui.admin
    layer = layui.layer;
    //表格的渲染
    table.render({
        //elem url cols 表格属性
        //field title sort 列属性
        page: true,
        elem: '#pricingList',
        // url: '../../items',
        url: '../../pricing/select',
        cols: [[

            {type: 'checkbox'},
            {field: 'pricingid', title: 'ID', sort: true},
            {field: 'pricingname', title: '商品名称'},
            {field: 'pricingcontent', title: '商品服务器地址'},
            {field: 'pricingprice', title: '商品价格'},
            {field: 'pricingselect', title: '价格选择器'}
        ]]
    });

    var active = {
        reload: function () {
            //val() text() html() $.trim($('#title').val())
            var title = $('#title').val();
            // != !==  == ===
            if ($.trim(title).length > 0) {
                //表格重载
                //页面，重载完了应该加载第一页
                //查询条件,第一个title应该和实体类中的属性一致，第二个js的变量
                table.reload('pricingList', {
                    page: {curr: 1},
                    where: {title: title}
                });
            }

        },
        getCheckData: function () {
            //批量删除的功能
            //先获取被选中的数据
            var status = table.checkStatus('pricingList');
            var data = status.data;
            if (2 > data.length > 0) {
                // alert(data[0].uid)
                $.post(
                    //url:这次异步请求提交到后台给谁处理
                    '../../pricing/delect',
                    //data:这次异步请求携带了什么数据给后台处理
                    {'pricingId':data[0].pricingid},
                    //success:这次异步请求处理成功的回调函数
                    function (data) {
                        if (data > 0) {
                            //删除后停留在原来页面
                            $('.layui-laypage-btn').click();

                            layer.msg('删除成功', {
                                icon: 1
                            });
                        } else {
                            //提示用户删除失败
                            layer.msg('删除失败', {
                                icon: 2
                            });
                        }
                    }
                );

            } else {
                layer.msg('请选择数据后再删除！(只能选择一个进行删除)', {icon: 5})
            }
        },
        editCheckData: function () {
            //批量删除的功能
            //先获取被选中的数据
            var status = table.checkStatus('pricingList');
            var data = status.data;

            if (2 > data.length > 0) {
                WeAdminEdit('修改用户页面','./edit',data,600,500);
            }else{
                layer.msg('(只能选择一个进行修改)', {icon: 5})
            }
        }
    };

    //批量删除按钮的操作代码
    $('.demoTable .layui-btn').on('click', function () {
        var type = $(this).data('type');//getCheckData data-type="getCheckData"
        active[type] ? active[type].call(this) : '';
    });

    //点击模糊查询按钮的操作代码
    $('.we-search .layui-btn').on('click', function () {
        var type = $(this).data('type');//reload data-type="reload"
        active[type] ? active[type].call(this) : '';
    });

    //商品状态的开关事件
    form.on('switch(itemstatus)',function(obj){
        console.log(obj.othis.parents('tr').find('[data-field=id] div').text());
    });

});


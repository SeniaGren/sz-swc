<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加订单-后台管理系统-Admin 1.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/weadmin.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/treeselect.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/treeselect.js"
            charset="utf-8"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="weadmin-body">
    <form class="layui-form" action="/service/update">
        <div class="layui-form-item" hidden>
            <label class="layui-form-label">serviceid</label>
            <div class="layui-input-block">
                <input type="text" name="serviceid" id="serviceid"  autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">servicename</label>
            <div class="layui-input-block">
                <input type="text" name="servicename" id="servicename" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">servicecontent</label>
            <div class="layui-input-block">
                <input class="layui-input" name="servicecontent"  id="servicecontent"/>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">serviceicon</label>
            <div class="layui-input-block">
                <input class="layui-input" name="serviceicon"  id="serviceicon"/>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="add" class="layui-form-label">
            </label>
            <button id="add" class="layui-btn" lay-filter="add" lay-submit="">修改</button>
        </div>
    </form>
</div>

<script>
    layui.extend({
        admin: '{/}../../static/js/admin',
        treeselect: '{/}../../static/js/treeselect'
    });
    layui.use(['form', 'admin', 'jquery', 'table', 'layer', 'layedit', 'treeselect'], function () {
        var form = layui.form,
            admin = layui.admin,
            $ = layui.jquery,
            table = layui.table,
            layer = layui.layer,
            layedit = layui.layedit,
            treeselect = layui.treeselect;

        //监听提交
        form.on('submit(add)', function (data) {
            console.log(data);
            var service = JSON.stringify(data.field);
            alert();
            //发异步，
            $.post(
                //url:这次异步请求提交到后台给谁处理
                '../../service/update',
                //data:这次异步请求携带了什么数据给后台处理
                {'service':service},


                //success:这次异步请求处理成功的回调函数
                function (data) {
                    if (data > 0) {
                        //删除后停留在原来页面
                        $('.layui-laypage-btn').click();
                        layer.msg('修改成功', {
                            icon: 1
                        });

                    } else {
                        //提示用户删除失败
                        layer.msg('修改失败', {
                            icon: 2
                        });
                    }
                    window.parent.location.reload();
                    var index=parent.layer.getFrameIndex(window.name);
                    parent.layer.close(index);

                }

            );
            // layer.alert("增加成功", {
            //     icon: 6
            // }, function () {
            //     // 获得frame索引
            //     var index = parent.layer.getFrameIndex(window.name);
            //     //关闭当前frame
            //     parent.layer.close(index);
            // });
            return false;
        });

    });
</script>
</body>

</html>
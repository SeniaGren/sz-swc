<%--
  Created by IntelliJ IDEA.
  User: ronny
  Date: 2018/9/28
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="keywords" content="">
    <meta name="description" content="">

    <title>宿州生物颗粒厂</title>
    <!-- stylesheet css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/font-awesome.min.css">  <!-- 圖標文件  -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/nivo-lightbox.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/nivo_themes/default/default.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/style.css">
    <!-- google web font css -->
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,300,600,700' rel='stylesheet'  type='text/css'>

    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=5dEsfUlwMV0GdHlxoqgvlxE0"></script>
    <script type="text/javascript">
        var map = new BMap.Map("allmap");
        //var map = new BMap.Map("map_canvas");
        map.centerAndZoom(new BMap.Point(121.48,31.22), 11);
        //Beijing for (116.404, 39.915), 11
        //Shanghai for (121.48 31.22), 11
        map.addControl(new BMap.MapTypeControl({
            mapTypes:[
                BMAP_NORMAL_MAP,
                BMAP_HYBRID_MAP
            ]}));
        map.addControl(new BMap.NavigationControl());
        map.addControl(new BMap.ScaleControl());
        map.addControl(new BMap.OverviewMapControl());
        map.setCurrentCity("宿州灵璧");
        // 设置地图显示的城市 此项是必须设置的
        map.enableScrollWheelZoom(true);
        //开启鼠标滚轮缩放
    </script>
</head>

<body>
<!-- 底部导航栏 -->
<footer id="footer">
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-sm-6">
                <h2>Our Office</h2>
                <p>安徽省宿州市</p>
                <p>Email: <span>hello@company.com</span></p>
                <p>Phone: <span>010-020-0340</span></p>
            </div>
            <div class="col-md-6 col-sm-6">
                <h2>Social Us</h2>
                <ul class="social-icons">
                    <li><a href="${pageContext.request.contextPath }/static/images/weixin.png" class="fa fa-qq"></a></li>
                    <li><a href="${pageContext.request.contextPath }/static/images/weixin.png" class="fa fa-tencent-weibo"></a></li>
                    <li><a href="${pageContext.request.contextPath }/static/images/weixin.png" class="fa fa-weibo"></a></li>
                    <li><a href="${pageContext.request.contextPath }/static/images/weixin.png" class="fa fa-facebook"></a></li>
                </ul>
            </div>
        </div>
    </div>
</footer>

<!-- javascript js -->
<script src="${pageContext.request.contextPath }/static/js/jquery.js"></script>
<script src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/static/js/nivo-lightbox.min.js"></script>
<script src="${pageContext.request.contextPath }/static/js/smoothscroll.js"></script>
<script src="${pageContext.request.contextPath }/static/js/jquery.nav.js"></script>
<script src="${pageContext.request.contextPath }/static/js/isotope.js"></script>
<script src="${pageContext.request.contextPath }/static/js/imagesloaded.min.js"></script>
<script src="${pageContext.request.contextPath }/static/js/custom.js"></script>
</body>
</html>

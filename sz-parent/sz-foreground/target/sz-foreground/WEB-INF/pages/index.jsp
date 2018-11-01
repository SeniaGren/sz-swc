<%--
  Created by IntelliJ IDEA.
  User: ronny
  Date: 2018/9/28
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

</head>
<body>
<nav class="navbar navbar-fixed-top navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">宿州生物颗粒厂</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <%--<li class="active"><a href="#">Home</a></li>--%>
                <li><a href="./index" class="smoothScroll" >网站主页</a></li>
                <li><a href="./service" class="smoothScroll" >产品展示</a></li>
                <li><a href="./portfolio" class="smoothScroll" >厂容厂貌</a></li>
                <li><a href="./pricing" class="smoothScroll" >产品展示</a></li>
                <li><a href="./about" class="smoothScroll" >关于我们</a></li>
                <li><a href="./contact" class="smoothScroll" >联系我们</a></li>
            </ul>
        </div><!-- /.nav-collapse -->
    </div><!-- /.container -->
</nav><!-- /.navbar -->
<!-- 欢迎词 -->
<div id="home">
    <div class="container">
        <div class="row">
            <div class="col-md-offset-6 col-md-6 col-sm-offset-6 col-sm-6">
                <h2>欢迎您来到</h2>

                <%--<p>宿州生物颗粒厂主要生产哈尔滨生物颗粒、满洲里生物颗粒以及成型生物的颗粒燃料，热值高、灰分低、能效高、无污染，主要用于锅炉等常规热力设备，打造环保型产业，环境保护做出贡献。自公司成立以来，全体员工齐心协力、求真务实，本着“诚信为本、服务创新”的企业宗旨。我们一向锐意创新，多渠道促进公司新能源产品与技术的研发和创新能力。我们拥有自设的生物质能燃料开发生产基地，保证燃料质量与供给。</p>--%>
                <c:forEach items="${indexpages}" var="indexpage">
                    <h1>宿州 <strong>${indexpage.indexcontent}</strong></h1>
                    <%--<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet. Dolore magna aliquam erat volutpat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet.</p>--%>
                    <%--<p>Dolore magna aliquam erat volutpat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet. Dolore magna aliquam erat volutpat.</p>--%>
                    <p>${indexpage.indexname}</p>
                </c:forEach>
                <a href="#footer" class="btn btn-default smoothScroll">联系我们</a>
            </div>
        </div>
    </div>
</div>

<!-- 底部导航栏 -->
<footer id="footer">
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-sm-6">
                <h2>Our Office</h2>
                <p>安徽省宿州市</p>
                <c:forEach items="${tbconnections}" var="tbcon">
                    <p>Email: <span>${tbcon.mailnumber}</span></p>
                    <p>Phone: <span>${tbcon.telephone}</span></p>
                </c:forEach>
            </div>
            <div class="col-md-6 col-sm-6">
                <h2>Social Us</h2>
                <ul class="social-icons">
                    <c:forEach items="${tbimages}" var="tbimgs">
                        <li>
                            <a href="${tbimgs.imgurl}" class="${tbimgs.imguid}"></a>

                        </li>
                    </c:forEach>
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

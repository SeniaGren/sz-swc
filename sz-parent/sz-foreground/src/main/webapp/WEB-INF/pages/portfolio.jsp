<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
	<!-- team section -->
	<div id="team">
		<div class="container">
			<div class="row">
				<br>
				<div class="col-md-12 col-sm-12">
					<h2>公司主要负责人</h2>
				</div>
				<%--<div class="col-md-3 col-sm-6">--%>
					<%--<img src="${pageContext.request.contextPath }/static/images/team1.jpg" class="img-responsive" alt="team img">--%>
					<%--<h3>Jonny Thinker</h3>--%>
					<%--<h4>Creative Director</h4>--%>
				<%--</div>--%>
				<%--<div class="col-md-3 col-sm-6">--%>
					<%--<img src="${pageContext.request.contextPath }/static/images/team2.jpg" class="img-responsive" alt="team img">--%>
					<%--<h3>Michael</h3>--%>
					<%--<h4>CEO / Cc-founder</h4>--%>
				<%--</div>--%>
				<%--<div class="col-md-3 col-sm-6">--%>
					<%--<img src="${pageContext.request.contextPath }/static/images/team3.jpg" class="img-responsive" alt="team img">--%>
					<%--<h3>George Walker</h3>--%>
					<%--<h4>Chief Designer</h4>--%>
				<%--</div>--%>
				<%--<div class="col-md-3 col-sm-6">--%>
					<%--<img src="${pageContext.request.contextPath }/static/images/team4.jpg" class="img-responsive" alt="team img">--%>
					<%--<h3>Mary Sandar</h3>--%>
					<%--<h4>UX Specialist</h4>--%>
				<%--</div>--%>

				<c:forEach items="${portfoliopages}" var="portfolio">
					<div class="col-md-3 col-sm-6">
					<img src="${portfolio.portfolioimgs }" class="img-responsive" alt="team img">
					<h3>${portfolio.portfolioname }</h3>
					<h4>${portfolio.portfoliooccupation }</h4>
					</div>

				</c:forEach>

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
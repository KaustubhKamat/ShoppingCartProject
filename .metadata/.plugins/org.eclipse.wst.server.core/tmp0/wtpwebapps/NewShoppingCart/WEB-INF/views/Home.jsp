<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>
body {
	font-family: sans-serif;
	font-size: medium;
	background-color: #f4f7f8;
}

.navbar-default {
	background-color: #F75D59;
}
</style>
</head>
<body>
	<!-- Navigation bar code -->

	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="Home">Shopping Cart</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<!--  <li class="active"><a href=>Link <span class="sr-only">(current)</span></a></li> -->
				<li class="dropdown"><a href="Category" class="dropdown-toggle"
					data-toggle="dropdown" role="button">Shop by Category <span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="Ciaz">Ciaz</a></li>
						<li><a href="Wagonr">Wagonr</a></li>
						<li><a href="Celerio">Celerio</a></li>
						<li><a href="Ritz">Ritz</a></li>
					</ul></li>
			</ul>
			<form class="navbar-form navbar-left">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Search">
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
			<ul class="nav navbar-nav navbar-right">

				<li><a href="Home">Home <span
						class="glyphicon glyphicon-home"></span></a>
				<li><a href="Cart">Cart <span
						class="glyphicon glyphicon-shopping-cart"></span></a>
				<li><a href="login">SignIn <span
						class="glyphicon glyphicon-user"></span></a></li>
				<li><a href="Register">SignUp </a></li>
				<li><a href="About Us">About Us <span
						class="glyphicon glyphicon-phone-alt"></span></a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>

	<c:if test="${showLoginPage}">
		<jsp:include page="Login.jsp"></jsp:include>
	</c:if>

	<c:if test="${ not empty ErrorMessage}">
		<jsp:include page="Registration.jsp"></jsp:include>
	</c:if>

	<!-- <img src="/resources/Celerio.jpg"s/width="500" height="500"> -->


	<!-- Carousel Code  -->

    <div class="container">
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		</ol>
		<!-- Wrapper for carousel items -->
		<div class="carousel-inner">
			<div class="item active">
				<img src="<c:url value="/Images/Ciaz.jpg" />"/>
			</div>
			<div class="item">
				<img src="wagonr.jpg" alt="Wagonr" width="500" height="500">
			</div>
			<div class="item">
				<img src="Celerio.jpg" alt="Celerio" width="500" height="500">
			</div>
			<div class="item">
				<img src="Ritz.jpg" alt="Ritz" width="500" height="500">
			</div>
		</div>
		<!-- Carousel controls -->
		<a class="carousel-control left" href="#myCarousel" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left"></span>
		</a> <a class="carousel-control right" href="#myCarousel"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right"></span>
		</a>
	</div>
	</div>



</body>
</html>


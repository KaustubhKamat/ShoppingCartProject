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
	font-family: cursive;
	font-size: large;
	background-color: #f4f7f8
}
 .carousel-control.left, .carousel-control.right {
   background-image:none !important;
   filter:none !important;
}
</style>
</head>
<body>
<!-- Navigation Bar -->
<div class="container">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="">ShoppingCart</a>
    </div>
    <ul class="nav navbar-nav">
		<c:if test="${ empty SuccessMessage}">
			<li><a href="login"> Login </a></li>
			<li><a href="Register"> Register</a></li>
			<li class="dropdown">
			<a class="dropdown-toggle" data-toggle="dropdown" href="Category">Shop By Category
			<span class="caret"></span></a>
			<ul class="dropdown-menu">
			<li><a href="Ciaz">Ciaz</a></li>
			<li><a href="Wagonr">Wagonr</a></li>
			<li><a href="Celerio">Celerio</a></li>
			<li><a href="Swift">Swift</a></li>
			<li><a href="Ritz">Ritz</a></li>
			</ul>
		     </li>
		    <li><a href="Contact Us">Contact Us</a> </li>
		    <li><a href="About Us">About Us</a> </li>
		</c:if>
	</ul> 
	</div>
</nav>
</div>
 
	${SuccessMessage}
	<c:if test="${showLoginPage}">
		<jsp:include page="Login.jsp"></jsp:include>
	</c:if>

	<c:if test="${ not empty ErrorMessage}">
${ErrorMessage}
<jsp:include page="Registration.jsp"></jsp:include>
	</c:if>


<!-- Carousel for images -->
<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
    </ol>
 
    <!-- Wrapper for slides -->
    <div class="carousel" role="listbox">

      <div class="item active">
        <img src="Ciaz.jpg" width="500" height="500">
        <div class="carousel-caption">
                </div>
      </div>

      <div class="item">
        <img src="wagnor.jpg" width="500" height="500">
        <div class="carousel-caption">
                  </div>
      </div>
    
      <div class="item">
        <img src="Celerio.jpg" width="500" height="200">
        <div class="carousel-caption">
                           </div>
      </div>

      <div class="item">
        <img src="Swift.jpg" width="500" height="500">
        <div class="carousel-caption">
                  </div>
      </div>
  
    </div>
    
    <div class="item">
        <img src="Ritz.jpg" width="500" height="500">
        <div class="carousel-caption">
                  </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>




</body>
</html>


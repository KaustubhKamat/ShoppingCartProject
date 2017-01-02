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
	background-color: white;
}

.navbar-default {
	background-color: #F75D59;
}
</style>
</head>
<body>
	<!-- Navigation bar code -->
	<jsp:include page="NavBar.jsp"></jsp:include>

	<c:if test="${showLoginPage}">
		<jsp:include page="Login.jsp"></jsp:include>
	</c:if>

	<c:if test="${ not empty ErrorMessage}">
		<jsp:include page="Registration.jsp"></jsp:include>
	</c:if>



	<jsp:include page="Carousel.jsp"></jsp:include>

<hr>
<div class="col-sm-offset-1 col-sm-15">
<label class="col-sm-4control-label">Get to know us</label>
</div>

<div class="col-sm-offset-3 col-sm-15">
<label class="col-sm-4control-label">Connect with us</label>
</div>

<div class="col-sm-offset-1 col-sm-15">
<a href="AboutUs"> About Us</a>
</div>

<div class="col-sm-offset-3 col-sm-15">
<a href="www.facebook.com"> Facebook</a>
</div>

</body>
</html>


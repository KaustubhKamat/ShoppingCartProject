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
h4 {
	font-family: sans-serif;
	font-size: medium;
	font-weight: bold;
}
</style>
</head>
<body>
	<!-- Navigation bar code -->
	<jsp:include page="NavBar.jsp"></jsp:include>


	<c:if test="${validate}">

		
	
	</c:if>
	${ErrorMessage}
	
	<c:if test="${ not empty ErrorMessage}">
		<jsp:include page="Registration.jsp"></jsp:include>
	</c:if>



	<jsp:include page="Carousel.jsp"></jsp:include>


<%-- <jsp:include page="NavBarForLogin.jsp"></jsp:include>
		<jsp:include page="Login.jsp"></jsp:include> --%> 
	
 <div class="container text-center">
    <hr />
  <div class="row">
    <div class="col-lg-12">
      <div class="col-md-3">
      <h4>Get to know Us</h4>
        <ul class="nav nav-pills nav-stacked">
          <li><a href="AboutUs">About Us</a></li>
          <li><a href="AboutUs">24x7 Customer Care</a></li>
        </ul>
      </div>
   <div class="col-md-3">
   <h4>Connect With Us</h4>
        <ul class="nav nav-pills nav-stacked">
          <li><a href="http://www.facebook.com">Facebook</a></li>
          <li><a href="http://twitter.com">Twitter</a></li>
          <li><a href="http://github.com/KaustubhKamat/ShoppingCartProject">My GitHub</a></li>
          
        </ul>
      </div>
       <div class="col-md-3">
       <h4>Let us Help you</h4>
        <ul class="nav nav-pills nav-stacked">
          <li><a href="login">Sign In</a></li>
          <li><a href="Register">Sign Up</a></li>
          <li><a href="Cart">Cart</a></li>
                    
        </ul>
      </div>
      </div>
      </div>
      </div>
</body>
</html>


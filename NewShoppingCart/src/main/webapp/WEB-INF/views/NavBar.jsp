<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.navbar-default {
	background-color: #F75D59;
	font-size: medium;
}

.dropdown-menu>li>a:hover {
	background-color: silver;;
	background-image: none;
}
${
LoggedInUser
}
{
color
:
 
white
;


}
</style>
<body>

	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
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
						<li><a href="HatchBack">Hatchback</a></li>
						<li><a href="Sedan">Sedan</a></li>
						<li><a href="SUV">SUV</a></li>
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
						class="glyphicon glyphicon-shopping-cart"></span></a></li>

				<c:if test="${not empty LoggedInUser}">
					<li>Welcome ${LoggedInUser}</li>
				</c:if>
				<c:if test="${empty LoggedInUser}">
					<li><a href="login">SignIn <span
							class="glyphicon glyphicon-user"></span></a></li>
				</c:if>


				<%-- <c:choose>
						<c:when test="${empty LoggedInUser}">
							<li><a href="login">SignIn <span class="glyphicon glyphicon-user"></span></a></li>
						</c:when> 
						<c:otherwise>
							<li>${LoggedInUser}</li>
						</c:otherwise>
						</c:choose>  --%>

				<c:if test="${empty LoggedInUser}">
					<li><a href="Register">SignUp <span
							class="glyphicon glyphicon-user"></span></a></li>
				</c:if>
				<c:if test="${not empty LoggedInUser}">
					<li><a href="Logout">Logout</a></li>
				</c:if>

				<%-- <c:choose>
						<c:when test="${empty LoggedInUser} }">
						<li><a href="Register">SignUp </a></li>
						</c:when>
						<c:otherwise> 
						<li><a href="Logout">LogOut </a></li>
						</c:otherwise>
						</c:choose>   --%>


				<li><a href="AboutUs">About Us <span
						class="glyphicon glyphicon-phone-alt"></span></a></li>
				
			</ul>

		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>


</body>
</html>
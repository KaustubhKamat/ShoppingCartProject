<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.navbar-default {
	background-color: #F75D59;
	font-size: medium;
}

.dropdown-menu>li>a:hover {
	background-color: silver;;
	background-image: none;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-inverse">
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
					data-toggle="dropdown" role="button">Category <span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="AddCategory">AddCategory</a></li>
						<li><a href="DeleteCategory">DeleteCategory</a></li>
						<li><a href="UpdateCategory">UpdateCategory</a></li>
						

					</ul></li>
			</ul>
			<form class="navbar-form navbar-left">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Search">
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
			<ul class="nav navbar-nav navbar-right">

				<li><a href="Home">Home <span class="glyphicon glyphicon-home"></span></a>
				<li><a href="Cart">Cart <span class="glyphicon glyphicon-shopping-cart"></span></a>
				<li class="dropdown"><a href="Supplier" class="dropdown-toggle"
					data-toggle="dropdown" role="button">Supplier <span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="AddSupplier">AddSupplier</a></li>
						<li><a href="DeleteSupplier">DeleteSupplier</a></li>
						<li><a href="UpdateSupplier">UpdateSupplier</a></li>
						</li></ul>
					<li class="dropdown"><a href="Products" class="dropdown-toggle"
					data-toggle="dropdown" role="button">Product <span
						class="caret"></span></a>	
						<ul class="dropdown-menu">
						<li><a href="AddProduct">AddProduct</a></li>
						<li><a href="DeleteProduct">DeleteProduct</a></li>
						<li><a href="UpdateProduct">UpdateProduct</a></li>
					</ul></li>
			</ul>
				<li><a href="Logout">Logout </a></li>
				<li><a href="AboutUs">About Us <span
						class="glyphicon glyphicon-phone-alt"></span></a></li>
			</ul>
		</div>
</body>
</html> 
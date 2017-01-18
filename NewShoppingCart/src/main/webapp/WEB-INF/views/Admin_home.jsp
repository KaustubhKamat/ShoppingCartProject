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

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
a {
	float: inherit;
	font-family: sans-serif;
	font-size: medium;
	padding-top: 40 px;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<div id="AdminHome">
		<ul class="nav navbar-nav">
			<!--  <li class="active"><a href=>Link <span class="sr-only">(current)</span></a></li> -->
			<li class="dropdown"><a href="ManageCategory"
				class="dropdown-toggle" data-toggle="dropdown" role="button">Manage
					Category <span class="caret"></span>
			</a>
				<ul class="dropdown-menu">
					<li><a href="AddCategory">Add Category</a></li>
					
				</ul></li>
			<li class="dropdown"><a href="ManageSupplier"
				class="dropdown-toggle" data-toggle="dropdown" role="button">Manage
					Supplier <span class="caret"></span>
			</a>
				<ul class="dropdown-menu">
					<li><a href="AddSupplier">Add Supplier</a></li>
					
				</ul></li>
			<li class="dropdown"><a href="ManageProduct"
				class="dropdown-toggle" data-toggle="dropdown" role="button">Manage
					Product <span class="caret"></span>
			</a>
				<ul class="dropdown-menu">
					<li><a href="AddProduct">Add Product</a></li>
					
				</ul></li>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
a{
font-family: sans-serif;
font-size: medium;
}
</style>
</head>
<body>

	<form class="form-horizontal">
		<div class="form-group">
		<h2 class="col-md-10 control-label">Welcome Admin. Select from the below options for Managing Categories</h2>
		</div>
		<div class="form-group">
			<a href="AddCategory" class="col-md-6 control-label">Add a Category</a>
			</div>
		<div class="form-group">
			<a href="DeleteCategory" class="col-md-6 control-label">Delete a Category</a>
			</div>
		<div class="form-group">
			<a href="UpdateCategory" class="col-md-6 control-label">Update a Category</a>
			</div>
		
	</form>
</body>
</html>
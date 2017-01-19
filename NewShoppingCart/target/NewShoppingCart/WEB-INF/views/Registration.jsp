<%@page import="java.util.Calendar"%>
<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
}

form {
	margin: 25px auto;
	font-size: medium;
	padding: 15px 20px;
	border-radius: 20px;
	text-align: left;
}

body {
	background: #f4f7f8;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%--  <jsp:include page="NavBar.jsp"></jsp:include> --%>
<form class="form-horizontal" action="user_register" method="post">
		<div class="form-group">
			<label class="col-sm-6 control-label">Create Account</label>
		</div>
		<div class="form-group">
			<label class="col-sm-5 control-label">Name</label>
			<div class="col-sm-15">
				<input type="text" name="Name">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-5 control-label">Mobile Number</label>
			<div class="col-sm-15">
				<input type="text" name="Mobile_number"><br>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-5 control-label">Email Address</label>
			<div class="col-sm-15">
				<input type="text" name="EmailId"><br>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-5 control-label">Password</label>
			<div class="col-sm-15">
				<input type="password" name="password"><br>
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-sm-offset-5 col-sm-20">
				<button type="submit" class="btn btn-default">Submit</button>
			</div>
		</div>
		<hr>
		<div class="col-sm-offset-5 col-sm-15">
			<label class="col-sm-4control-label">Already have an account?</label>
		</div>
		<div class="col-sm-offset-6 col-sm-15">
			<a href="login">SignIn</a>
		</div>
	</form>
</body>
</html>
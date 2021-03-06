<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Billing Address</title>
<style>
.button {
    background-color: #555555; /* Green */
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
}
</style>
</head>

<body>
<jsp:include page="NavBar.jsp"></jsp:include>

<h2>Please Enter the Billing Address</h2>

    <form:form action="" class="well form-veritical" modelAttribute="billingAddress" >
<div class="row">
<div class="col-md-4">
<label><h4><strong>Address Line1</strong></h4></label>
</div>
<div class="col-md-6">
<form:input type="text" name="Line1" path="Line1" class="form-control input-lg" required="true"></form:input>
</div>
</div>

<div class="row">
<div class="col-md-4">
<label><h4><strong>City</strong></h4></label>
</div>
<div class="col-md-6">
<form:input type="text" name="city" path="city" required="true"  class="form-control input-lg"></form:input>
</div>
</div>

<div class="row">
<div class="col-md-4">
<label><h4><strong>Country</strong></h4></label>
</div>
<div class="col-md-6">
<form:input type="text" name="country" path="country" required="true"  class="form-control input-lg"></form:input>
</div>
</div>


<div class="row">
<div class="col-md-4">
<label><h4><strong>Pincode</strong></h4></label>
</div>
<div class="col-md-6">
<form:input type="text" name="pincode" class="form-control input-lg" required="true" path="pincode" pattern="^[1-9][0-9]{5}$" title="PinCode should only contains Numbers and only 5 digits" ></form:input>
</div>
</div>

<div class="row">
<div class="col-md-3 col-md-offset-4">
<input type="submit" name="_eventId_submitBillingAddress" class="btn btn-success btn-lg" value="Submit">
</div>
<div class="col-md-3">
<input type="submit" name="eventId_cancel" class="btn btn-danger btn-lg" value="Cancel">
</div>
</div>

</form:form>

<jsp:include page="Footer.jsp"></jsp:include>


</body>
</html>
</body>
</html>
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
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.js"></script>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Payment Method</title>
</head>
<body>
    
    <jsp:include page="NavBar.jsp"></jsp:include>
    <h2>Please Select the Payment Method</h2>
    <div align="center">
    
    
<form:form modelAttribute="paymentMethod">
<form:select path="paymentMethod">
<form:option value="CashOnDelivery">Cash On Delivery</form:option>
<form:option value="Credit Card/Debit Card">Credit Card/Debit Card</form:option>
</form:select>
<input type="submit" name="_eventId_submitPaymentMethod" class="btn btn-success btn-lg" value="Submit">

<jsp:include page="Footer.jsp"></jsp:include>
        </form:form>
    </div>
    
    
</body>
</html>
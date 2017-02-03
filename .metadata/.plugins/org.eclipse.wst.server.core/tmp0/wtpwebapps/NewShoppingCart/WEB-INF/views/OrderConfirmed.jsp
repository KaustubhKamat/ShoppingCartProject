<html>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	
	<style>
	
	h2,h4{color: black;font-family: sans-serif}
	
	</style>
	
<body>
<jsp:include page="NavBar.jsp"></jsp:include>

<div class="col-md-8 col-md-offset-1">
<h2>Thanks for Purchasing from Shopping Cart. Your Order has been Processed</h2>
<h2>The Product Will be Delivered to your Shipping Address in 4 working days</h2>
<h3>Have a Good Day !!!!!</h3>
<br>
<h4>
Order Number :- ${order.order_id }</h4>

<h4> ${order.product_Name}</h4>


<form:form>
<div class="col-md-3 col-md-offset-4">
<input type="submit" name="_eventId_finalHome" class="btn btn-success btn-lg" value="Save">
</div>
</form:form>

<br>
<jsp:include page="Footer.jsp"></jsp:include>


</div>

</body>
</html>
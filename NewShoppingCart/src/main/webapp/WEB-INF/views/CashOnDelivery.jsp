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
	
	h2,h4{color: lightgreen;font-family: sans-serif}
	
	</style>
	
<body>
<div class="jumbotron" style="background-color: black">
<h2 style="color:black;">You have Selected the Cash on Delivery Option</h2>
<h2>You are eligible for the Free Home Delivery </h2>
<h2>Please pay Rs."${ProductPrice}"</h2>
<h2>A Email Notification and SMS of your order confirmation will be sent to you shortly</h2>
<h3>Have a Good Day !!!!!</h3>
<br>


<form:form>
<input type="submit" name="_eventId_finalHome" class="btn btn-success btn-lg" value="Save">

</form:form>





</div>

</body>
</html>
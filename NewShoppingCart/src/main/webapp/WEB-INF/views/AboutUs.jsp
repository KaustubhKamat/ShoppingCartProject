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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
h2 {
	font-family: sans-serif;
	font-size: medium;
	color: orange;
}

h3{
font-family: sans-serif;
font-size: medium;
color:orange; !important;;

}

p {
	font-family: sans-serif;
	font-size: medium;
	line-height: 20 px;
}

</style>
</head>
<body>


	<jsp:include page="NavBar.jsp"></jsp:include>
	<div class="container">
		<jsp:include page="CarousalForAboutUs.jsp"></jsp:include>
		<div class="col-sm-offset-0 col-sm-15">
			<h2>About Us</h2>
		</div>
			<p>All Consumers on Shopping Cart have an easy and convenient
				access to almost 10 Maruti Suzuki Products.They are benefited from the safe ordering experience,
				convenient payments,24x7 customer care, add to cart facilities</p>
				<p>They can also enjoy Shopping Cart's guaranteed One Day Delivery, Two Day Delivery, Sunday Delivery etc</p><hr>
			<div class="col-sm-offset-0 col-sm-25">
				<h3>For Customer Service please find below details</h3>
			</div>
			<div class="col-md-5">
			<p><label class="col-sm-4control-label">Email-ID--  </label>
			<a href="mailto:kaustubh235@gmail.com">customer_service@shoppingcart.com</a></p>
			
			<p><label class="col-sm-4control-label">Toll-Free Number-- 1800-000-0000  </label></p><hr>
			<h3>Registered Office Address</h3>
			<div class="col-md-7">
			<p>Shopping Cart Private Limited </p>
			<p>2nd Floor, ABCD Complex, Deccan  Pune-411041</p>
			</div>
		</div>
	</div>


</body>
</html>
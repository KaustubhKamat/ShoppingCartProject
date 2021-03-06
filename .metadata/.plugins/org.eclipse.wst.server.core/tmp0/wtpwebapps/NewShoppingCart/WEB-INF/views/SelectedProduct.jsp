<html>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>

<style>
button2 {
	padding-top: 100px;
	padding-right: 30px;
	padding-bottom: 50px;
	padding-left: 80px;
}
</style>

</head>
<body>

	<c:set var="Images"
		value="D:/Shopping Cart New Project/NewShoppingCart/src/main/webapp/resources/Images/"></c:set>

	<div class="container col-md-8">
		<div class="list col-md-4 ">
			<div class="thumbnail">

				<img src="${Images}${ProductID}.jpg">

				<div class="caption">
					<h3 style="color: black;">
						<strong>${ProductName}</strong>
					</h3>
					<h3 style="color: black;">
						<strong>Rs:-${ProductPrice}</strong>
					</h3>
				</div>

			</div>
			<div class="button2">
				<c:url var="addtocart" value="/AddToCart?pid=${ProductID}"></c:url>
				<a class="btn btn-success" href="cart_checkout">Checkout</a> <a
					class="btn btn-success" href="${addtocart}">Add To Cart</a>
			</div>
		</div>
	</div>

</body>
</html>
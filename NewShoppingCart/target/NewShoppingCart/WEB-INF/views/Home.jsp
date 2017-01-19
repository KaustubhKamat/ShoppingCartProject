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

<style>
body {
	font-family: sans-serif;
	font-size: medium;
	background-color: white;
}

.navbar-default {
	background-color: #F75D59;
}

h4 {
	font-family: sans-serif;
	font-size: medium;
	font-weight: bold;
}
</style>
</head>
<body>



	<jsp:include page="NavBar.jsp"></jsp:include>

	<c:if test="${carousaltobedisplayed==true}">
		<jsp:include page="Carousel.jsp"></jsp:include>
	</c:if>
	
	<c:if test="${UserHasClickedLogin==true}">
		<jsp:include page="Login.jsp"></jsp:include>
	</c:if>
	
	<c:if test="${UserhasclickedLogout==true}">
		<jsp:include page="Home.jsp"></jsp:include>
	</c:if>

	<c:if test="${UserhasclickedAboutUs==true}">
		<jsp:include page="AboutUs.jsp"></jsp:include>
	</c:if>

	<c:if test="${UserHasClickedRegister==true}">
		<jsp:include page="Registration.jsp"></jsp:include>
	</c:if>

	<c:if test="${isAdmin==true}">
		<jsp:include page="Admin_home.jsp"></jsp:include>
	</c:if>

<c:if test="${! empty UserSuccessSaveMessage}">
		${UserSuccessSaveMessage}
	</c:if>


	<c:if test="${validate}">
	</c:if>
	${ErrorMessage}

	<c:if test="${ not empty ErrorMessage}">
		<jsp:include page="Registration.jsp"></jsp:include>
	</c:if>
	
	<!-- Categories Related -->

	
	<c:if test="${AdminHasClickedAddCategory==true}">
		<jsp:include page="AddCategory.jsp"></jsp:include>
	</c:if>
	
	<c:if test="${  empty SuccessSaveMessage}">
	${SuccessSaveMessage}		
	</c:if> 
	<!-- Supplier Related -->
	<c:if test="${adminhasclickedManageSuppliers==true}">
		<jsp:include page="ManageSupplier.jsp"></jsp:include>
	</c:if>
	
	<c:if test="${AdminHasClickedAddSupplier==true}">
		<jsp:include page="AddSupplier.jsp"></jsp:include>
	</c:if>
<c:if test="${adminHasClickedManageProducts==true}">
		<jsp:include page="ManageProduct.jsp"></jsp:include>
	</c:if>
	
	<c:if test="${AdminHasClickedAddProduct==true}">
		<jsp:include page="AddProduct.jsp"></jsp:include>
	</c:if>
	
	
	

	<jsp:include page="Footer.jsp"></jsp:include>
 


</body>
</html>


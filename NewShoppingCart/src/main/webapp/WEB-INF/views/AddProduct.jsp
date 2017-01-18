<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Product Page</title>
<style>
table, th, td {
	border-style: groove; text-align : center; font-family : sans-serif;
	font-size : medium;
	padding: 1px;
	text-align: center;
	text-align: center;
	font-family: sans-serif;
	font-size: medium;
}
</style>

</head>
<body>
	${msg}
	<h2>Add Product</h2>
	<c:url var="addAction" value="/AddProduct_add"></c:url>
	<form:form action="${addAction}" modelAttribute="product"
		enctype="multipart/form-data" method="post">
		<table>
			<tr>

				<td><form:label path="id">
						<spring:message text="Enter ID" />
						<label class="col-sm-5 control-label"></label>
					</form:label></td>
				<c:choose>
					<c:when test="${!empty product.id}">
						<td><form:input path="id" disabled="true" readonly="true" /></td>
					</c:when>
					<c:otherwise>
						<td><form:input path="id" pattern=".{3,7}" required="true"
								title="id should contains 3 to 7 characters" /></td>
					</c:otherwise>
				</c:choose>
				</div>
			<tr>
				<td><form:label path="name">
						<spring:message text="Enter Product Name" />
						<label class="col-sm-5 control-label"></label>
					</form:label></td>
				<td><form:input path="name" required="true" /></td>
			</tr>
			<tr>
				<td><form:label path="description">
						<spring:message text="Enter Product Description" />
						<label class="col-sm-5 control-label"></label>
					</form:label></td>
				<td><form:input path="description" required="true" /></td>
			</tr>
			<tr>
				<td><form:label path="supplier">
						<spring:message text="Select the Supplier" />
						<label class="col-sm-5 control-label"></label>
					</form:label></td>
				<td><form:select path="supplier.name" items="${supplierList}"
						itemValue="name" itemLabel="name" /></td>
			</tr>
			<tr>
				<td><form:label path="category">
						<spring:message text="Select the Category" />
						<label class="col-sm-5 control-label"></label>
					</form:label></td>
				<td><form:select path="category.name" items="${categoryList}"
						itemValue="name" itemLabel="name" /></td>
			</tr>
			<tr>
				<td><form:label path="price">
						<spring:message text="Enter Price" />
						<label class="col-sm-5 control-label"></label>
					</form:label></td>
				<td><form:input path="price" required="true" /></td>
			</tr>
			<tr>
				<td><form:label path="stock">
						<spring:message text="Enter Total quantity available for sale" />
						<label class="col-sm-5 control-label"></label>
					</form:label></td>
				<td><form:input path="stock" required="true" /></td>
			</tr>
			<tr>
				<td align="left"><form:label path="image">
						<spring:message text=" Image" />
					</form:label></td>
				<td align="left"><form:input type="file" name="image"
						path="image" /></td>
			</tr>
			<tr>
				<td colspan="2"><c:if test="${!empty product.name}">
						<input type="submit"
							value="<spring:message text="Update Product"/>" />
					</c:if> <c:if test="${empty product.name}">
						<input type="submit" value="<spring:message text="Add Product"/>" />
					</c:if></td>
			</tr>

		</table>
	</form:form>
	<br>
	<div class="col-sm-offset-3 col-sm-20">
		<h3>Product List</h3>
	</div>
	<div class="col-sm-offset-0 col-sm-20">
		<c:if test="${!empty productList}">
			<table class="tg">
				<tr>
					<th width="200">Product ID</th>
					<th width="200">Product Name</th>
					<th width="200">Product Description</th>
					<th width="200">Supplier Name</th>
					<th width="200">Category Name</th>
					<th width="200">Price</th>
					<th width="200">Stock</th>
					<th width="150">Edit</th>
					<th width="150">Delete</th>
				</tr>
				<c:forEach items="${productList}" var="product">
					<tr>
						<td>${product.id}</td>
						<td>${product.name}</td>
						<td>${product.description}</td>
						<td>${product.supplier_id}</td>
						<td>${product.category_id}</td>
						<td>${product.price}</td>
						<td>${product.stock}</td>
						<td><a
							href="<c:url value="/AddProduct/edit?pid=${product.id}" />">Edit</a></td>

						<td><a
							href="<c:url value='/AddProduct/delete?pid=${product.id}' />">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
</body>
</html>







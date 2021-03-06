<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Add Supplier Page</title>
<style>
table, th, td {
	border-style:groove;
	text-align: center;
	font-family:sans-serif;
	font-size:medium;
	padding: 1px;
	text-align: center;
}
</style>

</head>
<body>
${msg}
	<h3>Add Supplier</h3>
	<c:url var="addAction" value="/AddSupplier_add"></c:url>
	<form:form action="${addAction}" modelAttribute="supplier"  method="post">
		<table>
			<tr>
			
		<td><form:label path="id"> <spring:message text="Enter Supplier ID" /><label class="col-sm-5 control-label"></label>	</form:label></td>
				<c:choose>
					<c:when test="${!empty supplier.id}">
						<td><form:input path="id"  readonly="true" /></td>
					</c:when>
					<c:otherwise>
						<td><form:input path="id" pattern=".{3,7}" required="true"
								title="id should contains 3 to 7 characters" /></td>
					</c:otherwise>
				</c:choose>
				</div>
			<tr>
			<form:input path="id" hidden="true"></form:input>
				<td><form:label path="name" ><spring:message text="Enter Supplier Name" /><label class="col-sm-5 control-label"></label> </form:label></td>
				<td><form:input path="name" required="true" /></td>
			</tr>
			<tr>
				<td><form:label path="address"><spring:message text="Enter Supplier Address"/><label class="col-sm-5 control-label"></label></form:label></td>
				<td><form:input path="address" required="true" /></td>
			</tr>
			
				
			<tr>
				<td colspan="2"><c:if test="${!empty supplier.name}">
						<input type="submit" value="<spring:message text="Update Category"/>" />
					</c:if> <c:if test="${empty supplier.name}">
						<input type="submit" value="<spring:message text="Add Category"/>" />
					</c:if></td>
			</tr>
			
		</table>
	</form:form>
	<br>
	<div class="col-sm-offset-3 col-sm-20">
	<h3>Supplier List</h3>
	</div>
	<div class="col-sm-offset-2 col-sm-20">
	<c:if test="${!empty supplierListGet}">
		<table class="tg">
			<tr>
				<th width="200">Supplier ID</th>
				<th width="200">Supplier Name</th>
				<th width="200">Supplier Address</th>
				<th width="150">Edit</th>
				<th width="150">Delete</th>
			</tr>
			<c:forEach items="${supplierListGet}" var="supplier" >
				<tr>
					<td>${supplier.id}</td>
					<td>${supplier.name}</td>
					<td>${supplier.address}</td>
					<td><a href="<c:url value="/AddSupplier/edit?sid=${supplier.id}" />">Edit</a></td>
					
					<td><a href="<c:url value='/AddSupplier/delete?sid=${supplier.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>







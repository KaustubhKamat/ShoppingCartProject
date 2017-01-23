<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Category Page</title>
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
	<h3>Add Category</h3>
	<c:url var="addAction" value="/AddCategory_add"></c:url>
	<form:form action="${addAction}" modelAttribute="category"  method="post">
		<table>
			<tr>
			
		<td><form:label path="id"  > <spring:message text="Enter ID" /><label class="col-sm-5 control-label"></label>	</form:label></td>
				<c:choose>
					<c:when test="${!empty category.id}">
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
			
				<td><form:label path="name" >	<spring:message text="Enter Name" /><label class="col-sm-5 control-label"></label> </form:label></td>
				<td><form:input path="name" required="true" /></td>
			</tr>
			<tr>
				<td><form:label path="description" > <spring:message text="Enter Description"/><label class="col-sm-5 control-label"></label></form:label></td>
				<td><form:input path="description" required="true" /></td>
			</tr>
			
				
			<tr>
				<td colspan="2"><c:if test="${!empty category.name}">
						<input type="submit" value="<spring:message text="Update Category"/>" />
					</c:if> <c:if test="${empty category.name}">
						<input type="submit" value="<spring:message text="Add Category"/>" />
					</c:if></td>
			</tr>
		</table>
	</form:form>
	<br>
	<div class="col-sm-offset-3 col-sm-20">
	<h3>Category List</h3>
	</div>
	<div class="col-sm-offset-2 col-sm-20">
	<c:if test="${!empty categoryList}">
		<table class="tg">
			<tr>
				<th width="200">Category ID</th>
				<th width="200">Category Name</th>
				<th width="200">Category Description</th>
				<th width="150">Edit</th>
				<th width="150">Delete</th>
			</tr>
			<c:forEach items="${categoryList}" var="category" >
				<tr>
					<td>${category.id}</td>
					<td>${category.name}</td>
					<td>${category.description}</td>
					<td><a href="<c:url value="/AddCategory/edit?cid=${category.id}" />">Edit</a></td>
					
					<td><a href="<c:url value='/AddCategory/delete?cid=${category.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>







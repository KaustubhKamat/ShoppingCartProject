<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, th, td {
	border-style: ridge;
	text-align: center;
	padding: 10px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="color: teal; font-size: 30px">Being Java Guys |
   Registration Form</div>

  <c:url var="deletesupplier" value="/DeleteSupplier /"></c:url>
  <form:form  modelAttribute="supplier" method="post" action="DeleteSupplier">
   <table width="400px" height="150px">
    <tr>
     <td><form:label path="firstName">First Name</form:label>
     </td>
     <td><form:input path="firstName" />
     </td>
    </tr>
    <tr>
     <td><form:label path="lastName">Last Name</form:label>
     </td>
     <td><form:input path="lastName" />
     </td>
    </tr>
    <tr>
     <td><form:label path="email">Email</form:label>
     </td>
     <td><form:input path="email" />
     </td>
    </tr>
    <tr>
     <td><form:label path="phone">Phone</form:label>
     </td>
     <td><form:input path="phone" />
     </td>
    </tr>
    <tr>
     <td></td>
     <td><input type="submit" value="Register" /></td>
    </tr>
   </table>
  </form:form>


  <a href="list">Click Here to see User List</a>
 </center>
<div class="col-sm-offset-4 col-sm-35">
<h3>Existing Supplier List</h3>
</div>
<div class="col-sm-offset-2 col-sm-20">
	<c:if test="${!empty supplierList}">
		<table class="tg">
			<tr>
				<th width="150">Supplier ID</th>
				<th width="150">Supplier Name</th>
				<th width="200">Supplier Address</th>
				<th width="100">Edit</th>
				<th width="150">Delete</th>
			</tr>
			</div>
			<c:forEach items="${supplierList}" var="supplier">
				<tr>
					<td>${supplier.id}</td>
					<td>${supplier.name}</td>
					<td>${supplier.address}</td>
					<td><a href="<c:url value='/manage_category_edit/${supplier.id}'/>">Edit</a></td>
					
					<td><a href="<c:url value='/manage_category_remove/${supplier.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>
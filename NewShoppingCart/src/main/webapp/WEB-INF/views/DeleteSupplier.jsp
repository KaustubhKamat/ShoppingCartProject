<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
 <center>

  <div style="color: teal; font-size: 30px">Being Java Guys |
   Registration Form</div>

  <c:url var="deleteSupplier" value="DeleteSupplier" />
  <form:form modelAttribute="supplier" method="post" action="${deleteSupplier}">
   <table width="400px" height="150px">
    <tr>
     <td><form:label path="supplier_id ">Enter Supplier ID</form:label>
     </td>
     <td><form:input path="supplier_id" />
     </td>
    </tr>
    <tr>
     <td><form:label path="supplier_name">Enter Supplier Name</form:label>
     </td>
     <td><form:input path="supplier_name" />
     </td>
    </tr>
    <tr>
     <td><form:label path="supplier_address">Enter Supplier Address</form:label>
     </td>
     <td><form:input path="supplier_address" />
     </td>
    </tr>
    <tr>
     <td></td>
     <td><input type="submit" value="DeleteSupplier" /></td>
    </tr>
   </table>
  </form:form>
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
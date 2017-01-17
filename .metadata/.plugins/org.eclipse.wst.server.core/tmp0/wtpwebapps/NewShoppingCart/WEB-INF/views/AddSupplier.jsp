<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<form class="form-horizontal" action="validate_supplier" method="post">
<div class="form-group">
<label class="col-sm-5 control-label">Enter Supplier Id</label>
<div class="col-sm-15">
<input type="text" name="supplier_id">
</div>
</div>
<div class="form-group">
<label class="col-sm-5 control-label">Enter Supplier Name</label>
<div class="col-sm-15">
<input type="text" name="supplier_name">
</div>
</div>
<div class="form-group">
<label class="col-sm-5 control-label">Enter Supplier Address</label>
<div class="col-sm-15">
<input type="text" name="supplier_address">
</div>
</div>
<hr>
<div class="form-group">
    <div class="col-sm-offset-5 col-sm-20">
      <button type="submit" class="btn btn-default">Add Supplier</button>
    </div>
  </div>
</form>
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
					<td><a href="<c:url value='/add_supplier_edit/${supplier.id}'/>">Edit</a></td>
					
					<td><a href="<c:url value='/add_supplier_delete/${supplier.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>
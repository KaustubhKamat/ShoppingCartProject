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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
	border-style: ridge;
	text-align: center;
	padding: 10px;
}
</style>

</head>
<body>

<form class="form-horizontal" action="add_category" method="post">
<div class="form-group">
<label class="col-sm-5 control-label">Enter Category Id</label>
<div class="col-sm-15">
<input type="text" name="category_id">
</div>
</div>
<div class="form-group">
<label class="col-sm-5 control-label">Enter Category Name</label>
<div class="col-sm-15">
<input type="text" name="category_name">
</div>
</div>
<div class="form-group">
<label class="col-sm-5 control-label">Enter Category Description</label>
<div class="col-sm-15">
<input type="text" name="category_description">
</div>
</div>
<div class="form-group">
    <div class="col-sm-offset-5 col-sm-20">
      <button type="submit" class="btn btn-default">Add Category</button>
    </div>
  </div>
</form>
<hr>
<div class="col-sm-offset-4 col-sm-35">
<h3>Existing Category List</h3>
</div>
<div class="col-sm-offset-3 col-sm-20">
	<c:if test="${!empty categoryList}">
		<table class="tg">
			<tr>
				<th width="150">Category ID</th>
				<th width="150">Category Name</th>
				<th width="200">Category Description</th>
						</tr>
			</div>
			<c:forEach items="${categoryList}" var="category">
				<tr>
					<td>${category.id}</td>
					<td>${category.name}</td>
					<td>${category.description}</td>
					
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>
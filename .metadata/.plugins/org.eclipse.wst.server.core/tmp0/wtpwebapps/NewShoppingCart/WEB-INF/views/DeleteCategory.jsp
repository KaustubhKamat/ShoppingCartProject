<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form class="form-horizontal" action="validate_category" method="post">
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
<hr>
<div class="form-group">
    <div class="col-sm-offset-5 col-sm-20">
      <button type="submit" class="btn btn-default">Submit</button>
    </div>
  </div>
</form>
<h3>Category List</h3>
	<c:if test="${!empty categoryList}">
		<table class="tg">
			<tr>
				<th width="80">Category ID</th>
				<th width="120">Category Name</th>
				<th width="120">Category Description</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${categoryList}" var="category">
				<tr>
					<td>${category.id}</td>
					<td>${category.name}</td>
					<td>${category.description}</td>
					<td><a href="<c:url value='/manage_category_edit/${category.id}' />">Edit</a></td>
					
					<td><a href="<c:url value='/manage_category_remove/${category.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<label class="col-sm-5 control-label">Enter Supplier Description</label>
<div class="col-sm-15">
<input type="text" name="supplier_name">
</div>
</div>
<hr>
<div class="form-group">
    <div class="col-sm-offset-5 col-sm-20">
      <button type="submit" class="btn btn-default">Submit</button>
    </div>
  </div>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.js"></script>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Billing Address</title>
</head>
<body>
    <div align="center">
        <form:form action="billingAddress" method="post" modelAttribute="billingAddress">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Billing Address</h2></td>
                </tr>
                <tr>
                    <td>Line 1</td>
                    <td><form:input path="Line1" /></td>
                </tr>
                <tr>
                    <td>City</td>
                    <td><form:input path="city" /></td>
                </tr>
                <tr>
                    <td>Country</td>
                    <td><form:input path="country" /></td>
                </tr>
                <tr>
                    <td>Pincode</td>
                    <td><form:input path="pincode" /></td>
                </tr>
                
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Submit" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<style >
    body {
    font-family:sans-serif;
    font-size:medium;
    text-align: center;
}

#indexLeftColumn {
    height: 100px;
    width: 100px;
    float:  left;
}

#indexRightColumn {
    height: 100px;
    width: 500px;
    float: inherit;
  
}

.categoryBox {
    height: 200px;
    width: 200px;
    margin: 40px 50px 30px;
    float: inherit;
}

.productLabelText {
    line-height: 150%;
    font-size: medium;
}

</style>

</head>
<body>
 <div id="main">
        
        
        <!-- <div id="indexLeftColumn">
           <div id="welcomeText">
        <p>You are In HatchBack Section of Category</p>
    </div>
        </div> -->

        <div id="indexRightColumn">
            <div class="productBox">
            <c:forEach items="${category.product}" var="category.product">
            <c:set var="product" value="categoryproduct"></c:set>
             <tr class="${((iter.index % 2) == 0) ? 'lightBlue' : 'white'}">
        <td>
            <img src="${initParam.productImagePath}${product.name}.jpg"
                 alt="${product.name}">
        </td>

        <td>${product.name}</td>
        <td>${product.description}</td>
        <td>${product.price}</td>
    </tr>
        </c:forEach>
    </div>
    
       </div>
    </div>
</body>
</html>
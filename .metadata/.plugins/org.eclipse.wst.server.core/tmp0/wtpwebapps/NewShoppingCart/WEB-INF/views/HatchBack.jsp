<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

#main { background: #eee }
#indexLeftColumn {
    height: 400px;
    width: 350px;
    float: left;
}

#indexRightColumn {
    height: 400px;
    width: 800px;
    float: left;
  
}

.categoryBox {
    height: 300px;
    width: 300px;
    margin: 40px 50px 30px;
    float: inherit;
}

.categoryLabelText {
    line-height: 150%;
    font-size: medium;
}
}

</style>

</head>
<body>

<jsp:include page="NavBar.jsp"></jsp:include>
<div id="main">
        
        
        <div id="indexLeftColumn">
           <div id="welcomeText">
        <p>You are In HatchBack Section of Category</p>
    </div>
        </div>

        <div id="indexRightColumn">
            <div class="categoryBox">
        <a href="Wagonr.jsp">
        <img src="resources/Images/WagonR1.jpg" alt="Wagonr" >
            <span class="categoryLabelText">Wagonr</span>
        </a>
    </div>
    <div class="categoryBox">
        <a href="Celerio">
        <img src="resources/Images/Celerio2.jpg" alt="Celerio" >
            <span class="categoryLabelText">Celerio</span>
        </a>
    </div>
    <div class="categoryBox">
        <a href="Swift">
        <img src="resources/Images/swift1.jpg" alt="Swift" >
            <span class="categoryLabelText">Swift</span>
        </a>
    </div>
    <div class="categoryBox">
        <a href="Alto800">
        <img src="resources/Images/alto800.jpg" alt="Alto800" >
            <span class="categoryLabelText">Alto 800</span>
        </a>
    </div>
        </div>

       
    </div>
</body>
</html>
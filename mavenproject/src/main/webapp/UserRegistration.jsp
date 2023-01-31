<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="margin-top: 0px; background-color:pink;">
<%@include file="header.jsp" %>
<center>
<form class="form"  action="UserCtl" method="post">
FirstName<input type="text" name="fname" placeholder="Enter your fname"><br>
LastName<input type="text" name="lname" placeholder="Enter your lname"><br>
Gender:<input type="radio" name="gender" value="male">male
 <input type="radio" name="gender" value="female" >female <br>
E-mail id <input type="text" name="emailid" placeholder="abc@xyz.com"><br>
<label for="password">Password</label> 
<input type="password" name="password" placeholder="Enter password"><br>
<input class="sub" type="submit" value="SingUp">
</form>
</center>
<%@include file="footer.jsp" %>
</body>
</html>
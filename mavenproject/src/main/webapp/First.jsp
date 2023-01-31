<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
body{ margin-top:100px;
background-color:pink;}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<header style="margin-top: 1px ">Registeration login</header>
<center>
<h1>User Registrations</h1>
<form action="second.jsp">
FirstName<input type="text" name="fname" placeholder="Enter your name"><br>
LastName<input type="text" name="lname" placeholder="Enter your name"><br>
<label for="dob">Enter DOB</label>
<input type="Date" name="dob" placeholder="dd/mm/yyyy"><br>
E-mail id <input type="text" name="mailid" placeholder="Enter your  e-mailid"><br>
<label for="password">Password</label> 
<input type="password" name="password" placeholder="Enter password"><br>
Gender:<br><input type="radio" name="gender" value="male">male
 <input type="radio" name="gender" value="female" >female <br>
 Qualifications:<br><input type="checkbox" name="education" value="ug">UG 
 <input type="checkbox" name="education" value="pg">PG
 <input type="checkbox" name="education" value="other">other <br>
 <input type="reset" name="reset" value="reset">
<input type="submit"  name="submit" value="submit">
</form>
</center>
<footer style="margin-top:145px"> copyright@ss</footer>
</body>
</html> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String name=(String)request.getParameter("fname"); %>
<%String lname=(String)request.getParameter("lname"); %>
<%String dob=(String)request.getParameter("dob"); %>
<%String mailid=(String)request.getParameter("mailid"); %>
<%String password=(String)request.getParameter("password"); %>
<%String gender=(String)request.getParameter("gender"); %>
<%String education=(String)request.getParameter("education"); %>

 

<%=name %>
<%=lname %>
<%=dob %>
<%=mailid%>
<%=password %>
<%=gender %>
<%=education %>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
form {
	height: 400px;
	width: 500px;
}

fieldset {
	background-color: skyblue;
}
</style>
</head>
<body style="margin-top: 150px">
	<center>
		<form action="login" method="post">
			<fieldset style="border: 3px solid black;">
				<fieldset style="border: 3px solid black;">
					<legend>login</legend>
					E-mail id <input type="text" name="email"
						placeholder="Enter your  e-mailid"><br> <label
						for="password">Password</label> <input type="password"
						name="password" placeholder="Enter password"><br> <input
						type="submit" value="SingUp">
	</center>
	</fieldset>
	</fieldset>
	</form>
</body>
</html>
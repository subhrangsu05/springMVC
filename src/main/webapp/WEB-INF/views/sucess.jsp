<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<h5>${row} inserted in the table...</h5>
	<p>My name is ${user.userName} </p>
	<p>My email id ${user.Email} </p>
	<p> My password is ${user.Password} </p>
</body>
</html>
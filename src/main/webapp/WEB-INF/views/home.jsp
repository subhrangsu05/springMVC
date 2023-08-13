<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home web Page</title>
</head>
<body>
 <h1>Welcome Everyone</h1>
 <h2>We've created this home page used by Java MVC ROUTING</h2>
 <%
 	String myName = (String) request.getAttribute("name");
 %>
 <h1>My Self: <%=myName%></h1>
</body>
</html>
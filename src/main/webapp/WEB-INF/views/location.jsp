<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>location web Page</title>
</head>
<body>
	<h1>*******************Welcome Everyone********************</h1>
 <h2>*****************We've created this location page used by Java MVC ROUTING**********************</h2><hr>
 <c:forEach var = "item" items = "${locationn}">
 <h2>Our office locations are: ${item } </h2></c:forEach>
</body>
</html>
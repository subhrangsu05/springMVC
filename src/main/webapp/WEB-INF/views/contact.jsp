<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact web page</title>
</head>
<body>
	<h2>We've created this contact page used by Java MVC ROUTING</h2>
	<%Map<String,String>cont = (Map<String,String>) request.getAttribute("contacts");
	for(Map.Entry<String,String> i : cont.entrySet()){
	%>
	<h4>This <%=i.getValue()%> is the contact of <%=i.getKey()%>.</h4>
	<%} %>
</html>
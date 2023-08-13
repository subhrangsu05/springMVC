<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>about web page</title>
</head>
<body>
  <h2>We've created this about page used by Java MVC ROUTING</h2>
  <%  
  List<String>friendObject = (List<String>)request.getAttribute("friendList");
     for(String is : friendObject){
  %>
  <h1>I'm Interested on <%=is %> And </h1>
  <%} %>
</body>
</html>
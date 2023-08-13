<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="true" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
  </head>
  <body><div class ="container mt-5">
  <h3 class="text-center">${header}</h3><hr>
    <form action = "processForm" method ="post">
     	<div class="mb-3">
     		<label for="InputName" class="form-label"><strong>Full Name</strong></label>
    		<input type="text" class="form-control" name = "name" id="InputName" aria-describedby="emailHelp" placeholder="Enter Your Name">
  	    </div>	
  		<div class="mb-3">
    		<label for="InputEmail1" class="form-label"><strong>Email address</strong></label>
    		<input type="email" class="form-control" name = "email"  id="InputEmail1" aria-describedby="emailHelp" placeholder="example@gmail.com">
    		<div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  		</div>
  		<div class="mb-3">
    		<label for="InputPassword1" class="form-label"><strong>Password</strong></label>
    		<input type="password" class="form-control" name = "password" id="InputPassword1" placeholder="Enter Your password Here...">
  		</div>
   		 <div class="col-auto text-center">
    		<button type="submit" class="btn btn-primary mb-3"><strong>Submit</strong></button>
  		</div>
	</form></div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
  </body>
</html>
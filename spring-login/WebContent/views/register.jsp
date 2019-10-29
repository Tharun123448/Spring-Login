<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>registration</title>
</head>
<body>
	<h1>UserRegistration</h1>
	<spring:form action="register" method="post">
		<table align="center">
		 <tr>
			<td><spring:label path="firstname">First Name</spring:label></td>
			<td><spring:input path="firstname" name="firstname" id="firstname"/></td>	
		 </tr>
		 <tr>
		 	<td><spring:label path="lastname">Last Name</spring:label></td>
		 	<td><spring:input path="lastname" name="lastname" id="lastname"/></td>
		 </tr>
		 <tr>
		 	<td><spring:label path="userid">user Id</spring:label></td>
		 	<td><spring:input path="userid" name="userid" id="userid"/></td>
		 </tr>
		 <tr>
		 	<td><spring:label path="password">Password</spring:label></td>
		 	<td><spring:input path="password" name="password" id="password"/></td>
		 </tr>
		 <tr>
		 	<td><spring:label path="confirmpassword">Confirm Password</spring:label></td>
		 	<td><spring:input path="confirmpassword" name="confirmpassword" id="confirmpassword"/></td>
		 </tr>
		 <tr>
		 	<td><spring:button id="register" name="register">Register</spring:button>
		 </tr>
		 <tr>
		 </tr>
		 	<td>already registered,click here to  <a href="login.jsp">login</a></td>
		</table>
	</spring:form>
</body>
</html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>successfully registered</title>
</head>
<body>
	<h1>Banking</h1>
<center>you are registered successfully, login here....</center>
	<spring:form action="loginchecker" method="post">
		<table>
			<thead>UserLogin</thead>
			<tr>
				<td>
					<spring:label path="username">User Name</spring:label>
				</td>
				<td>
					<spring:input path="username" name="username" id="username"/>
				</td>
			</tr>
			<tr>
				<td>
					<spring:label path="password">Password</spring:label>
				</td>
				<td>
					<spring:input path="password" name="password" id="password"/>
				</td>
			</tr>
			<tr>
				<td>
					<spring:button id="login" name="login">login</spring:button>
				</td>
			</tr>
			<tr>
				<td> go to <a href="home.jsp">home</a></td>
			</tr>
		</table>
	</spring:form>
	<%-- <table align="center">
		<tr>
			<td style="font-style:italic; color:red;">${message}</td>
		</tr>
	</table> --%>
</body>
</html>
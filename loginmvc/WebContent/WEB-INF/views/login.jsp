<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<style type="text/css">
			.error{
				color:"red";
				font-weight: bold;
			}
		</style>	
	<meta charset="ISO-8859-1">
	<title>login</title>
	</head>
	<body>
		<h1 align="center">Welcome</h1>
		<br><br>
		<form:form action="login.htm" modelAttribute="userLogin" method="post">
			<table align="center">
				<thead align="center">
					<tr>
						<th>User Login</th>
					</tr>
				</thead>
				<tr>
					<td>
						<form:label path="user_id">UserId </form:label>
					</td>
					<td>
						<form:input path="user_id" name="userId" id="userId"/>
					</td>
					<td>
						<form:errors path="user_id" cssClass="error"/>
					</td>
				</tr><tr>
					<td>
						<form:label path="password">Password </form:label>
					</td>
					<td>
						<form:password path="password" name="password" id="password"/>
					</td>
					<td>
						<form:errors path="password" cssClass="error"/>
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="register"></td>
				</tr>
			</table>
		</form:form>
		<table align="center">
			<tr>
				<td>
					not yet registered, <a href="registration.htm">register</a>
				</td>
			</tr>
		</table>
	</body>
</html>
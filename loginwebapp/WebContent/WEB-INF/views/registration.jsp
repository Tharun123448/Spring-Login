<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<style type="text/css">
			.error{
				color="red";
				font-weight: bold;
			}
		</style>
		<meta charset="ISO-8859-1">
		<title>registration</title>
	</head>
	<body>
		<h1 align="center">Welcome</h1><br><br>
		<form:form action="registration.htm" modelAttribute="userRegistration" method="post">
			<table align="center">
				<!-- <thead align="center">
					<tr>
						<th>User Login</th>
					</tr>
				</thead> -->
				<tr>
					<td>
						<form:label path="userName">UserName </form:label>
					</td>
					<td>
						<form:input path="userName" name="userName" id="userName"/>
					</td>
					<td>
						<form:errors path="userName" class="error"></form:errors>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="userId">UserId </form:label>
					</td>
					<td>
						<form:input path="userId" name="userId" id="userId"/>
					</td>
					<td>
						<form:errors path="userId" cssClass="error"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="emailId">EmailId </form:label>
					</td>
					<td>
						<form:input path="emailId" name="emailId" id="emailId"/>
					</td>
					<td>
						<form:errors path="emailId" cssClass="error"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="password">Password </form:label>
					</td>
					<td>
						<form:input path="password" name="password" id="password"/>
					</td>
					<td>
						<form:errors path="password" cssClass="error"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="confirmPassword">Confirm Password </form:label>
					</td>
					<td>
						<form:input path="confirmPassword" name="confirmPassword" id="confirmPassword"/>
					</td>
					<td>
						<form:errors path="confirmPassword" cssClass="error"/>
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="register"></td>
				</tr>
			</table>
			<br>
		</form:form>
			<table align="center">
				<tr><td>
					already registered, <a href="login.htm">login</a>
				</td></tr>
			</table>
		
	</body>
</html>
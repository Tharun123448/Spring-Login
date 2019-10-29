<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Banking</h1>

	<spring:form action="loginchecker" method="post">
		<table>
			<thead>User Login</thead>
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
				<td>not yet registered, <a href="register.jsp">register</a></td>
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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<tr>
<td>Username</td>
<td>EmailId</td>
<td>userId</td>
</tr>
<c:forEach items="${userDetails}" var="userDetails" varStatus="status">
<tr valign="top">
<td>${userDetails.name}</td>
<td>${userDetails.email_id}</td>
<td>${userDetails.user_id}</td>
</tr>
</c:forEach>
</table>


</body>
</html>
<%@page import="com.rays.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		UserBean user = (UserBean) session.getAttribute("user");
	%>
	<%
		if (user != null) {
	%>
	<h3><%="Welcome:  " + user.getFirstName() + " " + user.getLastName()%></h3>
	<a href="UserCtl"> ADD USER</a> ||
	<a href="UserListCtl"> USER LIST</a> ||
	<a href="LoginCtl?operation=LOGOUT">LOGOUT</a>
	<%
		} else {
	%>
	<h3>Welcome: GUEST</h3>
	<a href="UserRegistrationCtl">SIGNUP</a> ||
	<a href="LoginCtl">LOGIN</a>
	<%
		}
	%>
	<hr>
</body>
</html>
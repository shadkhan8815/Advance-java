<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
   
</head>
<body>

	<%@ include file="Header.jsp"%>
	<h1 align="center">Online Result system</h1>

	<br>
	<br>
	<br>
	<br>
	<%
		String msg = (String) request.getAttribute("msg");
	%>
	<%
		if (msg != null) {
	%>
	<h3 align="center"><%=msg%></h3>
	<%
		}
	%>
	<br>
	<br>
	<br>
	<br>
	<h1 align="center">
  
   <div id="typed-text"></div>
 
   <script src="https://cdn.jsdelivr.net/npm/typed.js@2.0.12"></script>
  <script>
    var typed = new Typed('#typed-text', {
      strings: ["Welcome"],
      typeSpeed: 150,
      backSpeed: 50,
      loop: true
    });
  </script>
	 
  </h1>

</body>
</html>
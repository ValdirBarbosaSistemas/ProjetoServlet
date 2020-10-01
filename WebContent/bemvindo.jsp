<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bemvindo JSP</title>
</head>
<body>
	<div align="center">
		<%
			String nomeBemvindo = (String) request.getAttribute("login");
		%>
		<p>
			Olá
			<%=nomeBemvindo%>
			Bem vindo a esta página JSP
		</p>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.infotel.travel.model.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% User user = (User) session.getAttribute("client_profil");%>
	<h1>PROFIL</h1>
	<p>bonjour, <%=user.getUsername()%>
	<p>mot de passe : <%=user.getPassword() %>...Mais qui est le couillon qui affiche le mot de passe...heu des chiffres!</p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="user" class="com.infotel.travel.model.User"></jsp:useBean>
<%session.setAttribute("user", user); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="moncompte">Acceder au compte</a>
	
	<h1>Login page</h1>
	
	<form action="moncompte">
		<input type="text" name="username" />
		<input type="password" name="password" />
		
		<input type="submit" value="ENVOYER" />
	</form>
</body>
</html>
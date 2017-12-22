<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user" scope="session" class="java.util.Date"></jsp:useBean>

<form action="compte/MonCompte">
<input type="text" name="username" />
<input type="password" name="password" />
<input type="submit" value="OK" />
</form>
</body>
</html>
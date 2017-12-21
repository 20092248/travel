<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
 isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<h1>Test</h1>
	<c:forEach items="${list_flight}" var="a">
	
		<img width="200" height="200" onerror="this.src='images/airlines/default.png'" src="images/airlines/${a.airline_id.id}.png"/> 
		<figcaption>${a.airline_id.name}</figcaption>
		
	</c:forEach>
</div>
</body>
</html>
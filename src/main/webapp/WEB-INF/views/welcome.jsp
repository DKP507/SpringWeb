<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">

<meta charset="ISO-8859-1">
</head>
<body>
	<h1>Greetings : ${greetings}</h1>

	<form action="hello">
		UserName : <input type="text" name="name" /> <br>
		<br> Password : <input type="text" name="pass" /> <br>
		<br> <input type="submit" name="submit">
	</form>

</body>

</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Welcome to Account Page</title>
</head>
<body>
	<h1>This is the Accounts Page</h1>
	
	<c:forEach var="account"  items="${Account}">
	
	<h1> Account Number</h1>
	<span><c:out value="${account.accountNumber}"></c:out></span>
	
	<h1> Account Name</h1>
	<span><c:out value="${account.accountName}"></c:out></span>
	
	
	</c:forEach>
</body>
</html>
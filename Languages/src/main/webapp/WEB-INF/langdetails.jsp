<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Language Details</title>
</head>
<body>
<a href = "/">Dashboard</a>
<p><c:out value="${thislang.name}"/></p>
<p><c:out value="${thislang.creator}"/></p>
<p><c:out value="${thislang.currentVersion}"/><p>

<a href="/edit/${thislang.id}">Edit</a>|<a href="delete/${thislang.id}">Delete</a> 
</body>
</html>
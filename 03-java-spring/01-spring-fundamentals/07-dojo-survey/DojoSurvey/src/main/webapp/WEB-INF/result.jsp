<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Survey Result</title>
</head>
<body>
<h1>Name: <c:out value="${name}"/></h1>
<h1>Location <c:out value="${location}"/></h1>
<h1>Preferred Coding Language <c:out value="${language}"/></h1>
<h1>Comments <c:out value="${comments}"/></h1>
</body>
</html>
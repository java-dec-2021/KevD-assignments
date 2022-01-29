<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dojo</title>
</head>
<body>
<h1>Create A Dojo!</h1>
<form:form method="POST" action="/createDojo" modelAttribute="dojo">
<p>
<form:label path="name">Name</form:label>
<form:errors path="name"/>
<form:input path="name"/>
<button>Create Dojo</button>
</p>

</form:form>
</body>
</html>
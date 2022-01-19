<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages</title>
</head>
<body>
<h1>Welcome to Coding Languages!</h1>

<table>
<thead>

<tr>
<td>Name</td>
<td>Creator</td>
<td>Current Version</td>
<td>Actions</td>
</tr>

</thead>
<tbody>
<c:forEach items="${allLanguages}" var="language">
<tr>
<td><a href="/langdetails/${language.id}">${language.name}</a></td>
<td>${language.creator}</td>
<td>${language.currentVersion}</td>
<td><a href="/edit/${language.id}">Edit</a> <a href="/delete/${language.id}">Delete</a></td>
</tr>
</c:forEach>
</tbody>

</table>

<h2>Add a Language</h2>
<form:form action="/" method="POST" modelAttribute="language">
<p>
<form:label path="name">Name: </form:label>
<form:errors path="name"/>
<form:input path="name"/>
</p>
<p>
<form:label path="creator">Creator: </form:label>
<form:errors path="creator"/>
<form:input path="creator"/>
</p>
<p>
<form:label path="currentVersion">Current Version: </form:label>
<form:errors path="currentVersion"/>
<form:input path="currentVersion"/>
</p>
<button> Submit </button>
</form:form>

</body>
</html>
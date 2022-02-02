<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
<table>
<tr>
<th>Question</th>
<th>Tags</th>
</tr>
<c:forEach items="${allquestions}" var="q">
<tr>
<td><a href="show/${q.id}">${q.questionText}</a></td>
<td>
<p>
<c:forEach items="${q.questionTags}" var="qt">
${qt.subject},
</c:forEach>
</p>
</td>
</tr>
</c:forEach>



</table>
</body>
</html>
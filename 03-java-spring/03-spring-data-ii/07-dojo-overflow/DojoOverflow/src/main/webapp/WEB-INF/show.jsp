<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${question.questionText}</h1>
<p>
<c:forEach items="${question.questionTags}" var="tag">
${tag.subject},
</c:forEach>
</p>
<hr>
<h2>Answers</h2>
<ul>
<c:forEach items="${question.answers}" var="answer">
<li>${answer.answerText}</li>
</c:forEach>
</ul>
<hr>
<h3>Add Answer</h3>
<form:form method="POST" action="/newAnswer" modelAttribute="answer">
<p>
<form:label path="answerText">Answer:</form:label>
<form:errors path="answerText"/>
<form:textarea path="answerText"/>
<form:hidden path="quest" value="question.id"/>
</p>
<button>Add Answer</button>
</form:form>
</body>
</html>
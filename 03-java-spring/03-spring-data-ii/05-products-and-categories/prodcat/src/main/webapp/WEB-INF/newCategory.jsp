<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Category</title>
</head>
<body>

<h1>Create New Category</h1>
<form method="POST" action="/newCategory">
<p>
<label for="name">Name</label>
<input type="text" name="name">
</p>
<button>Create Category</button>

</form>
</body>
</html>
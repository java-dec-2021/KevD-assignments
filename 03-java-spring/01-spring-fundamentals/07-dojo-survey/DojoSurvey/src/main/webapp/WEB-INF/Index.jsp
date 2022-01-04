<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
	<h1>Dojo Survey</h1>
	<hr>
	<form action="/result" method="post">
	
	<p>
	<label>Your Name</label>
	<input type="text" name="name">
	</p>
	<p>
	<label>Your Location</label>
	<select name="location">
	<option value="Seattle">Seattle</option>
	<option value="Dallas">Dallas</option>
	<option value="San Jose">San Jose</option>
	<option value="Oakland">Oakland</option>
	</select>
	</p>
	<p>
	<label>Preferred Coding Language</label>
	<select name="language">
	<option value="Python">Python</option>
	<option value="Java">Java</option>
	<option value="JavaScript">JavaScript</option>
	</select>
	</p>
	<p>
	<label>Comments(optional)</label>
	<textarea name="comments"></textarea>
	</p>
	<button>Submit Survey</button>
	
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Category</title>
</head>
<body>
<h1> <c:out value="${category.name}"/> </h1>
<hr>
<h2>Products</h2>
<ul>
<c:forEach items="${category.products}" var="product">
<li>${product.name} | ${product.description} | ${product.price}
</c:forEach>
</ul>

<form method="POST" action="/addProdToCat/${category.id}">
<select name="products">
<c:forEach items="${notInCategory}" var="product">
<option value="${product.id}">${product.name}</option>
</c:forEach>
</select>
<button>Add Product</button>
</form>
</body>
</html>
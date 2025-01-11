<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlDemo</title>
</head>
<body>
<c:out value="hello jsp"/><!-- out.println("hello jsp") -->
<hr>
<c:forEach var="i" begin="1" end="5">
	<c:out value="hello jsp"/><br>
</c:forEach>
</body>
</html>
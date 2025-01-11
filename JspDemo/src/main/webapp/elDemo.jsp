<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
int x=100;
request.setAttribute("X", x);
int y=20;
session.setAttribute("Y", y);
int[] abc=new int[]{20,50,63,3,41};
request.setAttribute("ABC", abc);
%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>elDemo</title>
</head>
<body>
30*20=${30*20 }<br>
60>80=${60>80 }<br>
60>40=>${"60>40" }<br>
60>50 && 70>50--->${60>50 && 70>50}<br>
60>50 && 70>50--->${60>50 and 70>50}<br>
x=${X*2 }<br>
y=${Y+5 }<br>
<c:out value="${X}"/>
<hr>
<c:forEach var="i" begin="1" end="10"><!-- for(int i=1;i<=10;i++){} -->
	<c:out value="hello, ${i}"/><br>
</c:forEach><br>
<c:forEach var="M" items="${ABC }"><!-- for(int M:ABC){} -->
	<c:out value="hello, ${M}"/><br>
</c:forEach>
</body>
</html>
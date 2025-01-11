<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String X=session.getAttribute("X1").toString();
String Y=String.valueOf(session.getAttribute("Y1"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessionObject</title>
</head>
<body>
x=<%=X %><br>
y=<%=Y %>
</body>
</html>
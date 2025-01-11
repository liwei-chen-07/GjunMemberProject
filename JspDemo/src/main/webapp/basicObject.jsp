<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String X=request.getParameter("x");
String Y=request.getParameter("y");
session.setAttribute("X1",X);
session.setAttribute("Y1",Y);

response.sendRedirect("sessionObject.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>basicObject</title>
</head>
<body>
x=<%=X %><br>
y=<%=Y %>
</body>
</html>
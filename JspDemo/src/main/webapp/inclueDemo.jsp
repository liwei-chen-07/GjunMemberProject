<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inclueDemo</title>
</head>
<body>
<table>
	<tr>
		<td colspan=2><%@include file="basic.jsp" %>
	<tr>
		<td><%@include file="formDemo.jsp" %>
		<td><%@include file="pageDemo.jsp" %>
</table>
</body>
</html>
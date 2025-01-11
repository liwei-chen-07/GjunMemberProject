<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.Date"
	import="java.time.LocalDate,java.time.LocalDateTime"%>
<%
//java.util.Date d=new java.util.Date();
Date d=new Date();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pageDemo</title>
</head>
<body>
<br>日期=<%=d %><br><br>
日期=<%=LocalDate.now() %><br><br>
日期=<%=LocalDateTime.now() %>
</body>
</html>
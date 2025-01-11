<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="model.Order"%>
<%!
int abc=10;
int cal(int a,int b)
{
	return a*b;
}
%>
<%
System.out.println("hello jsp II "+9*9);
out.println("<br>hello jsp II "+(9*9+9));
Order o=new Order();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP basic</title>
</head>
<body><br>
System.out.println("hello jsp"+9*9);
<hr>
7*6/3=<%=7*6/3 %><br>
abc=<%=abc %><br>
6*7=<%=cal(6,7) %>
</body>
</html>
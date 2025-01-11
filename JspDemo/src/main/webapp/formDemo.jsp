<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>formDemo</title>
</head>
<body>
get<br>
<form action="basicObject.jsp" method="get">
x:<input type="text" name="x"><br>
y:<input type="text" name="y"><br>
<input type="submit" value="ok">
</form><br>
post<br>
<form action="basicObject.jsp" method="post">
x:<input type="text" name="x"><br>
y:<input type="text" name="y"><br>
<input type="submit" value="ok">
</form>
</body>
</html>
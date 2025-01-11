<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspBeanDemo</title>
</head>
<body>
	<jsp:useBean id="o1" class="model.Order"/><!-- model.Order o1 =new model.Order()-->
	<jsp:setProperty property="name" name="o1" value="teacher"/><!-- name:物件名稱 ,property:field名 -->
	name=<jsp:getProperty property="name" name="o1"/><br>
	name=${o1.name }<br>
	name=${o1.getName() }<br>
	<jsp:setProperty property="lcd" name="o1" value="10"/>
	<jsp:setProperty property="ram" name="o1" value="5"/>
	
	訂單資料=${o1.show() }
	<hr>
	<jsp:include page="basic.jsp"/>
	<br>
	<jsp:include page="test.html"/>
	<br>
	<jsp:include page="abc.txt"/>
</body>
</html>
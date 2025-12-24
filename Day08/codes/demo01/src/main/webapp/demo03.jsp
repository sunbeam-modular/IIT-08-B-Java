<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method = "post" action = "calcres.jsp">
Num1 : <input type = "text" name = "num1"/><br/><br/>
Operation : <select name = "op">
<option value="+">+</option>
<option value="-">-</option>
<option value="*">*</option>
<option value="/">/</option>
</select><br/><br/>
Num2 : <input type = "text" name = "num2"/><br/><br/>
<input type = "submit" value = "Calculate"/>
</form>
</body>
</html>
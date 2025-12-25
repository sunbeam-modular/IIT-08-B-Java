<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="lb" class = "com.sunbeam.beans.LoginBean" "/>
<jsp:setProperty name = "lb" property="*"/>
${lb.authenticate()}
<c:choose>
	<c:when test="${not empty lb.user}">
		<h2>Login Successful</h2>
	</c:when>
	<c:otherwise>
		<h2>Login failed</h2>
	</c:otherwise>
</c:choose>
</body>
</html>
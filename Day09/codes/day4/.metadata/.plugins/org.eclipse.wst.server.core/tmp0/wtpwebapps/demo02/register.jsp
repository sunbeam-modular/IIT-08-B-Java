<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="rb" class = "com.sunbeam.beans.RegistrationBean"/>
<jsp:setProperty name = "rb" property="*" />
<jsp:setProperty name = "rb" property="status" value = "false" />
<jsp:setProperty name = "rb" property="role" value = "voter" />
${rb.registerUser()}
<c:choose>
	<c:when test="${rb.regStatus}">
	<h2>Congratulations</h2>
	<h3>Registration Success</h3>
	<a href = "index.jsp">LoginHere</a>
	</c:when>
	<c:otherwise>
	<h2>Registration Failed</h2>
	<a href ="newuser.jsp">SignUp Again</a>
	<a href = "index.jsp">Login</a>
	</c:otherwise>
</c:choose>
</body>
</html>
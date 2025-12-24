<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Roll<%= request.getParameter("roll") %></h2><br/>
<h2>Name<%= request.getParameter("name") %></h2><br/>
<h2>Marks<%= request.getParameter("marks")%></h2><br/>
</body>
</html>
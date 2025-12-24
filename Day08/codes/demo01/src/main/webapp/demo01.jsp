<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>HELLO JSP</h2>
<%! int count = 1; %>
<%!
		public void jspInit( ){
			System.out.println("jspInit()"); 
		}
		public void jspDestroy( ){
			System.out.println("jspDestroy()"); 
		}
%>
<%= new Date() %>
<%
		System.out.println("jsp_service called");
		count++; 
%>
<%--
		if(count%2 == 0){
			out.println("Even count : "+count); 
		}
		else{
			out.println("odd count : "+count); 	
		}

--%>
<%if(count%2==0){%>
Even count <%= count%>
<%}else{%>
Odd count <%=count%>
<%}%>
</body>
</html>
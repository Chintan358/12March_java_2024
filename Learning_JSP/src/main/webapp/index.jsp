
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="true" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
		${msg}
		<h1>Index</h1>
		
		<%! public int a = 20; %>
		
		<%
			//int i=10/0;
	
		/* 	int a[] = new int[5];
			a[6] = 20; */
			
			 int a = 20;
		%>
		
		<%=a %>
</body>
</html>
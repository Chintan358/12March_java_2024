<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.mysql.jdbc.Driver" %>
   <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/project" user="root" password=""/>
		<sql:query var="data" dataSource="${db}">
		select * from user;
		</sql:query>
		
		<c:forEach var="dt" items="${data.rows}">
		<span>${dt.id}</span>
		</c:forEach>
		
</body>
</html>
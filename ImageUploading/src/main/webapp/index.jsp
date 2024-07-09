<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>User Registration</h1>
	
	<form action="upload" enctype="multipart/form-data" method="post">
	<input type="text" name="uname" placeholder="Enter username">
	<input type="file" name="file">
	<input type="submit">
	</form>
	
	<br>
	
	<table border="1">
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Image</th>
	</tr>
	
	<%
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_rishabh","root","");
	PreparedStatement ps  =cn.prepareStatement("select * from upload");
	ResultSet rs = ps.executeQuery();
	while(rs.next())
	{ %>
		
		<tr>
		<td><%=rs.getInt(1)%></td>
		<td><%=rs.getString(2) %></td>
		<td><img src="img/<%=rs.getString(3)%>" alt="<%=rs.getString(3) %>" width="50px" height="50px"></td>
		</tr>
		
	<%}
	
	%>
	
	
	</table>
	
</body>
</html>
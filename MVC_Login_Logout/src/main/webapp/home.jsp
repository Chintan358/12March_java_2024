<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String user = (String)session.getAttribute("user");
		if(user == null)
		{
			request.setAttribute("err","Please login first !!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
	%>
	<h1>Home, Welcome, <%=user%></h1>

	<ul>
		<li>Laptop</li>
		<li>Mouse</li>
		<li>Keyboard</li>
		<li>speaker</li>
	</ul>

	<h2><a href="logout">Logout</a></h2>
</body>
</html>
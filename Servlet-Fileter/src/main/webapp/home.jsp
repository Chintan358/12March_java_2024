<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>


</head>

<body>

	<div class="container">
		<div class="row">

			<div class="col-md-5 card p-5 shadow-lg m-auto">
				<h1 align="center" class="text-success">Registration form</h1>

			

				
				<hr>

				<form action="reg" method="post">
						
						<input type="hidden" name="id" value="${udata.getId()}">
					<div class="form-group">
						<label for="uname">Username</label> <input type="text" id="uname"
							name="uname" class="form-control" value="<%if(request.getParameter("uname")!=null){%><%=request.getParameter("uname")%><%}%>">
						<span id="unameErr" class="text-danger">${unameErr}</span>
					</div>

					<div class="form-group">
						<label for="email">Email</label> <input type="text" id="email"
							name="email" class="form-control" value="<%if(request.getParameter("email")!=null){%><%=request.getParameter("email")%><%}%>">
						<span id="emailErr" class="text-danger">${emailErr}</span>
					</div>


					<div class="form-group">
						<label for="pass">Password</label> <input type="password"
							id="pass" name="pass" class="form-control" value="<%if(request.getParameter("pass")!=null){%><%=request.getParameter("pass")%><%}%>">
						<span id="passErr" class="text-danger">${passErr}</span>
					</div>

					<div class="form-group">
						<label for="cpass">Confirm password</label> <input type="password"
							id="cpass" name="cpass" class="form-control" value="<%if(request.getParameter("cpass")!=null){%><%=request.getParameter("cpass")%><%}%>"
							> <span id="cpassErr"
							class="text-danger" >${cpassErr}</span>
					</div>


					<input type="submit" class="btn btn-success" id="smbtn"> <input
						type="reset" class="btn btn-primary">
					<a href="display" class="btn btn-warning">Display Users</a>
				</form>
			</div>

		

		</div>


	</div>


</body>

</html>
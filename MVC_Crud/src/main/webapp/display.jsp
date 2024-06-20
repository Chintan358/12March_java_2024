<%@page import="model.User"%>
<%@page import="java.util.ArrayList"%>
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

<script>
	function validation() {

		var uname = document.getElementById("uname").value
		var email = document.getElementById("email").value
		var pass = document.getElementById("pass").value
		var cpass = document.getElementById("cpass").value
		var smbtn = document.getElementById("smbtn")
		var unameErr = document.getElementById("unameErr")
		var emailErr = document.getElementById("emailErr")
		var passErr = document.getElementById("passErr")
		var cpassErr = document.getElementById("cpassErr")

		var unamexp = /^[a-zA-z]+$/
		var emailExp = /^[a-zA-Z0-9]+@[a-zA-Z]+\.[a-z]{1,4}$/
		if (uname == "" || uname == null) {
			unameErr.innerHTML = "Username shuld not be blank"
			smbtn.disabled = true
		} else if (!unamexp.test(uname)) {
			unameErr.innerHTML = "Username shuld contains char only"
			smbtn.disabled = true
		} else {
			unameErr.innerHTML = ""
			smbtn.disabled = false
		}

		if (email == "" || email == null) {
			emailErr.innerHTML = "email shuld not be blank"
			smbtn.disabled = true
		} else if (!emailExp.test(email)) {
			emailErr.innerHTML = "Invalid email formate"
		} else {
			emailErr.innerHTML = ""
			smbtn.disabled = false
		}

		if (pass == "" || pass == null) {
			passErr.innerHTML = "password shuld not be blank"
			smbtn.disabled = true
		} else {
			passErr.innerHTML = ""
			smbtn.disabled = false
		}

		if (cpass == "" || cpass == null) {
			cpassErr.innerHTML = "cpassword shuld not be blank"
			smbtn.disabled = true
		} else if (cpass != pass) {
			cpassErr.innerHTML = "Cpass must be same as pass"
			smbtn.disabled = true
		} else {
			cpassErr.innerHTML = ""
			smbtn.disabled = false
		}

	}
</script>
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

	<div class="container">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<a class="navbar-brand" href="#">Navbar</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link" href="#">Home
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> Dropdown </a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="#">Action</a> <a
								class="dropdown-item" href="#">Another action</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="#">Something else here</a>
						</div></li>
					<li class="nav-item"><a class="nav-link" href="#">Welcome , <%=user %></a>
					</li>
					
					<li class="nav-item"><a class="btn btn-primary" href="logout">Logout</a>
					</li>
				</ul>
				<form class="form-inline my-2 my-lg-0">
					<input class="form-control mr-sm-2" type="search"
						placeholder="Search" aria-label="Search">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				</form>
			</div>
		</nav>
		<div class="row">

	
			<div class="col-md-6 card p-5 shadow-lg ml-5 m-auto">
				<h1 align="center" class="text-success">User Detais</h1>

				<table class="table table-striped table-dark">
					<tr>
						<th>Id</th>
						<th>Username</th>
						<th>Email</th>

						<th colspan="2">Action</th>
					</tr>
					
					<%
						ArrayList<User> al =(ArrayList<User>)request.getAttribute("data");
						for(User u  :al)
						{ %>
							<tr>
						<td><%=u.getId() %></td>
						<td><%=u.getUname() %></td>
						<td><%=u.getEmail() %></td>
						
						<td><a href="update?uid=<%=u.getId()%>&action=delete" class="btn btn-danger">Delete</a></td>
						<td><a href="update?uid=<%=u.getId() %>&action=edit"class="btn btn-primary">Update</a></td>
						</tr>
						<% }
					
					%>
				
						
				

					

				

				
				</table>
			</div>


		</div>


	</div>


</body>

</html>
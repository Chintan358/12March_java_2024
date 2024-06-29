<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

	<script type="text/javascript">
	
	$(document).ready(function(){
		 display()
		 $("#ubtn").hide()
	})
	
	
	function display()
	{
		$.get("display",{},function(rt){
			const data = JSON.parse(rt)
			
			var row = ""
			for(var i=0;i<data.length;i++)
			{
				row = row+"<tr><td>"+data[i].id+"</td><td>"+data[i].uname+"</td><td>"+data[i].email+"</td><td><button class='btn btn-primary' onclick='edituser("+data[i].id+")'>Edit</button></td><td><button class='btn btn-danger' onclick='deleteuser("+data[i].id+")'>Delete</button></td></tr>"
			}
			$("#tdata").html(row)
		})
	}
	
	function addUser()
	{
		var uname = $("#uname").val()
		var email = $("#email").val()
		var pass = $("#pass").val()
		
		$.post("reg",{uname,email,pass},function(rt){
			alert(rt)
			display()
			$("#uname").val("")
			$("#email").val("")
			$("#pass").val("")
			
		})
	}
	
	function deleteuser(uid)
	{
		$.get("update",{uid,"action":"delete"},function(rt){
			alert(rt)
			display()
		})
	}
	
	function edituser(uid)
	{
		$.get("update",{uid,"action":"edit"},function(rt){
			const data = JSON.parse(rt)
			$("#id").val(data.id)
			$("#uname").val(data.uname)
			$("#email").val(data.email)
			$("#pass").val(data.pass)
			
			$("#ubtn").show()
			$("#sbtn").hide()
		})
	
	}
	
	function updateUser()
	{
		var id = $("#id").val()
		var uname = $("#uname").val()
		var email = $("#email").val()
		var pass = $("#pass").val()
		
		$.post("edit",{id,uname,email,pass},function(rt){
			alert(rt)
			display()
			 $("#id").val("")
			$("#uname").val("")
			$("#email").val("")
			$("#pass").val("")
			
			$("#ubtn").hide()
			$("#sbtn").show()
			
		})
	}
	
	
	function search(value)
	{
		$.get("search",{value},function(rt){
			const data = JSON.parse(rt)
			
			var row = ""
			for(var i=0;i<data.length;i++)
			{
				row = row+"<tr><td>"+data[i].id+"</td><td>"+data[i].uname+"</td><td>"+data[i].email+"</td><td><button class='btn btn-primary' onclick='edituser("+data[i].id+")'>Edit</button></td><td><button class='btn btn-danger' onclick='deleteuser("+data[i].id+")'>Delete</button></td></tr>"
			}
			$("#tdata").html(row)
		})
	}
	
	</script>

</head>


<body>
	
	<div class="container">
	
	<div class="row">
		
		<div class="col-md-5">
		<h1>Registration</h1>
		
		<input type="hidden" id="id">
		<div class="form-group">
		<label>Username</label>
		<input type="text" name="uname" id="uname" class="form-control">
		</div>
		
		<div class="form-group">
		<label>Email</label>
		<input type="text" name="email" id="email" class="form-control">
		</div>
		
		<div class="form-group">
		<label>Password</label>
		<input type="text" name="pass" id="pass" class="form-control">
		</div>
		
		<button class="btn btn-success" onclick="addUser()" id="sbtn">Submit</button>
			<button class="btn btn-success" onclick="updateUser()" id="ubtn">Update</button>
		</div>
		
		<div class="col-md-7">
		<h1>User Information</h1>
		
		<input type="text" name="search" class="form-control" placeholder="Serach" onkeyup="search(value)">
		<hr>
		<table class="table">
		<thead>
		<tr>
		<th>Id</th>
		<th>Username</th>
		<th>Email</th>
		<th colspan="2">Action</th>
		</tr>
		</thead>
		
		<tbody id="tdata">
		
		</tbody>
		
		</table>
		
		</div>
	
	</div>
	</div>
	
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	
</body>
</html>
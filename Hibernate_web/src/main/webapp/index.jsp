<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
			
				<div class="col-md-5 mx-auto card p-3 mt-5">
				<h1 align="center">Product Registration</h1>
				<hr>
				<span class="text-success">${msg}</span>
				<span class="text-danger">${err}</span>
				<form action="reg" method="post">
				<input type="hidden" name="id" value="${data.getId()}">
				<div class="form-group">
				<label>Product Name</label>
				<input type="text" name="pname" class="form-control" value="${data.getPname()}">
				</div>
				
				<div class="form-group">
				<label>Price</label>
				<input type="text" name="price" class="form-control" value="${data.getPrice() }">
				</div>
				
				
				<div class="form-group">
				<label>Qty</label>
				<input type="text" name="qty" class="form-control" value="${data.getQty()}">
				</div>
				
				
				<input type="submit" class="btn btn-success">
				
				</form>
				<a href="display">Display Product</a>
				</div>
				
			</div>
		</div>
			
		
		
		
		
		
		
</body>
</html>
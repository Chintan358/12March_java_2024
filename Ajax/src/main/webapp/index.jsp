<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	<script type="text/javascript">
	
	$(document).ready(function(){
		
		$.get("country",{},function(rt){
			$("#country").html(rt)
		})
		
	})
	
	function getState(value)
	{
		
		$.get("state",{value},function(rt){
			$("#state").html(rt)
		})
		
	}
    
	function getCity(value)
	{
	
		$.get("city",{value},function(rt){
			$("#city").html(rt)
		})
		
	}
	
	function test(value)
	{
		$.get("ser1",{value},function(rt){
			
			$("#data").html(rt)
		})
	}
	
	</script>

</head>
<body>
		
		<input type="text" name="uname" id="uname" onkeyup="test(value)"><br>
		<span id="data"></span>
		
		<hr>
		
		
		<select id="country" onchange="getState(value)">
		<option>---Select Country---</option>
		</select>
		
		<select id="state" onchange="getCity(value)">
		<option>---Select State---</option>
		</select>
		
		
		<select id ="city">
		<option>---Select City---</option>
		</select>
		
		
		
</body>
</html>
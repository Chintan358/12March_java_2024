<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>OTP verify</h1>
<span>${msg}</span>
<form action="otp" method="post">
<input type="text" name="otp" placeholder="Enter otp">
<input type="submit">
</form>

</body>
</html>
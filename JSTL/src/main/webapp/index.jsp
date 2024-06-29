<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
 <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fun" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		<%-- <c:forEach begin="1" end="10" var="dt">
		<c:out value="${dt}"></c:out>
		</c:forEach>
	 --%>
	 
	<%--  	<c:import url="https://www.fb.com" var="data"></c:import>
	 	<c:out value="${data}"></c:out> --%>
	 	
<%-- 	 	<c:set var="a" value="${1000*4}"></c:set>
	 	<c:out value="${a}"></c:out>
	  --%>
	  
	  <c:set var="dt" value="sun rises in east"></c:set>
	  <c:out value="${dt}"></c:out>
	  <br>
	  <c:out value="${fun:contains(dt,'sun')}"></c:out>
	  
</body>
</html>
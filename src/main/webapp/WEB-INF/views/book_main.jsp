<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서관리</title>
<style>
body{
	text-align: center; 	
}
</style>
</head>
<body>
	<h2><b>도서 정보 관리 메인</b></h2>
	<p>
		<a href="<c:url value='/add'/>">[도서 추가]</a>
		<a href="<c:url value='/list'/>">[도서 목록]</a>
	</p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 상세 정보</title>
<style>
body{
	text-align: center; 	
}
table{
	margin: auto;
	text-align: left;
}
</style>
</head>
<body>
<form>
	<h3>도서 정보</h3>
	<table border="1">
	<tr>
		<td rowspan="6"><img src="<spring:url value='/resources/image/${books.realFileName }'/>" width="300" ></td>
	</tr>
	<tr>
		<th>BOOK ISBN</th>
		<td>${books.isbn }</td>
	</tr>
	<tr>
		<th>도서명</th>
		<td>${books.bookName }</td>
	</tr>
	<tr>
		<th>저자</th>
		<td>${books.writer }</td>
	</tr>
	<tr>
		<th>출판사</th>
		<td>${books.publisher }</td>
	</tr>
	<tr>
		<th>도서 가격</th>
		<td>${books.bookPrice }</td>
	</tr>
	<tr>
		<th>책 소개</th>
		<td colspan="2">${books.bookIntroduction }</td>
	</tr>
	</table>
	<input type="button" value="목록으로" onclick="window:location='<c:url value='/list'/>'">
</form>	
</body>
</html>
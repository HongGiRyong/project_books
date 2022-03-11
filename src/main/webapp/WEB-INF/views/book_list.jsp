<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 목록</title>
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
	<h2>도서 목록</h2>
	<c:if test="${!empty booksList }">
	<form:form action="search" method="GET" >
		검색 키워드 입력 : 
		<input type="text" name="value"/>
		<input type="submit" value="찾기"/>
	</form:form>
	<table border="1">
		<tr>
			<th>등록 번호</th><th>도서 표지</th><th>도서 ISNB</th>
			<th>도서 제목</th><th>저자</th><th>출판사</th><th>가격</th>
		</tr>
		<c:forEach var="book" items="${booksList }">
			<tr>
				<td>${book.regNum }</td>
				<td><img src="<spring:url value='/resources/image/${book.realFileName }'/>" width="150" ></td>
				<td>${book.isbn }</td>
				<td><a href="<c:url value='/detail/${book.regNum }'/>">${book.bookName }</a></td>
				<td>${book.writer }</td>
				<td>${book.publisher }</td>
				<td>${book.bookPrice }원</td>
			</tr>
		</c:forEach>
	</table>
	</c:if>
	
	<c:if test="${empty booksList }">
		도서 정보가 없습니다!<br>
	</c:if>
	
	<input type="button" value="도서 정보 추가" onclick="window:location='<c:url value='/add'/>'">
	<input type="button" value="메인으로" onclick="window:location='<c:url value='/main'/>'">
</body>
</html>
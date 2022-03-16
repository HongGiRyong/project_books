<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 정보 추가</title>
<style type="text/css">
body{
	text-align: center; 	
}
table{
	margin: auto;
	text-align: left;
}
a{
	color: red;
}
</style>
<script>
function PreviewImage() {
 
    var preview = new FileReader();
    preview.onload = function (e) {

    	document.getElementById("user_image").src = e.target.result;
	};
	preview.readAsDataURL(document.getElementById("imageFile").files[0]);
};
</script>
</head>
<body>
	<h3>도서 추가</h3>
	<form:form commandName="books" enctype="multipart/form-data">
		<table border="1">
			<tr>
				<th colspan="3" align="right"><a>*</a>표시는 필수입니다.</th>
			</tr>
			<tr>
				<th rowspan="7" width="33%"><img id="user_image" src="#" alt="" width="250" ></th>
			</tr>
			<tr>
				<th><a>*</a>BOOK ISBN</th>
				<td><form:input path="isbn" />
				<form:errors path="isbn"/></td>
			</tr>
			<tr>
				<th><a>*</a>도서명</th>
				<td><form:input path="bookName"/>
				<form:errors path="bookName"/></td>
			</tr>
			<tr>
				<th><a>*</a>저자</th>
				<td><form:input path="writer"/>
				<form:errors path="writer"/></td>
			</tr>
			<tr>
				<th><a>*</a>출판사</th>
				<td><form:input path="publisher"/>
				<form:errors path="publisher"/></td>
			</tr>
			<tr>
				<th><a>*</a>도서 가격</th>
				<td><form:input path="bookPrice"/>
				<form:errors path="bookPrice"/></td>
			</tr>
			<tr>
				<th><a>*</a>이미지</th>
				<td><input type="file" name="imageFile" id="imageFile" onchange="PreviewImage();" accept="image/*"/>
				
				<form:errors path="imageFile"/></td>
			</tr>
			<tr>
				<th><a>*</a>책 소개</th>
				<td colspan="2"><form:textarea rows="10" cols="50" path="bookIntroduction"/>
				<form:errors path="bookIntroduction"/></td>
			</tr>	
		</table>
		<input type="submit" value="등록">
		<input type="button" value="메인으로" onclick="window:location='<c:url value='/main'/>'">
	</form:form>
</body>
</html>
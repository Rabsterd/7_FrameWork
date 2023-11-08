<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>조회 결과 성공</title>
</head>
<body>

	<h2>회원 정보</h1>
	<table>
		<tr>
			<th>회원 번호</th>
			<th>회원 아이디</th>
			<th>회원 이름</th>
			<th>회원 나이</th>
		</tr>
		<tr>
			<th>${userNo}</th>
			<th>${userId}</th>
			<th>${userName}</th>
			<th>${age}</th>
		 </tr>
	
	</table>


</body>
</html>
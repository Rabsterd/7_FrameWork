<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 조회</title>
</head>
<body>
	<h1>회원 정보 조회(회원번호 검색)</h1>
	<!-- form 안에 있는 데이터를 /selectUser로 보낸다  --> 
	<form  action="/selectUser">
		<input type="text" name="inputUserNo" placeholder="회원 번호 입력">
		<button>조회</button>
	</form>
</body>
</html>
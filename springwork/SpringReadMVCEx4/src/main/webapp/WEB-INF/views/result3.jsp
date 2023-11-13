<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Gamja+Flower&family=Jua&family=Lobster&family=Nanum+Pen+Script&family=Permanent+Marker&family=Single+Day&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<style>
   body * {
       font-family: 'Jua';
   }
  
</style>
</head>
<body>
<h1>날짜 : ${today}</h1>
<h3>상품명 : ${shopDto.sang}</h3>
<h3>색상 : ${shopDto.color}</h3>
<h3>수량 : ${shopDto.su}</h3>
<h3>단가 : ${shopDto.dan}</h3>
<h3>총금액 : ${shopDto.su*shopDto.dan}</h3>
<h3>사진</h3>
<img src="./res/image/${shopDto.photo}">
</body>
</html>
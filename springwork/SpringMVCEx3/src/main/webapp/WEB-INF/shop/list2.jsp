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
  
  .photo{
   	width:200px;
   	height: 300px;
   	padding: 10px;
   	border: 2px solid gray;
   	border-radius: 30px;
   	box-shadow: 3px 3px 3px gray;
   	float: left;
   	margin:10px;
   }
  
   .photo img{
   	width:160px;
   	height: 180px;
   	border-radius: 30px;
   }
   
</style>
</head>
<body>
<h2>message:${message}</h2>
<h3>날짜 : <fmt:formatDate value="${today}" pattern="yyyy-MM-dd HH:mm"/></h3>
	<c:forEach var="dto" items="${list}">
		<div class="photo">
		
			<figure>
				<img src="../../photo/${dto.photo}">
				<figcaption>
					<h5>${message}</h5>
					<h6>${today}</h6>
				</figcaption>
			</figure>
		</div>
	</c:forEach>

</body>
</html>
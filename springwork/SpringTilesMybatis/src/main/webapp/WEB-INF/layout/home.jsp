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
   
   .home_img{
 		  	
   }
}
</style>
</head>
<c:set var="root" value="<%=request.getContextPath()%>"/>

<body>
<h2>비트캠프에 오신것을 환영합니다</h2>
<img src="${root}/res/photo/C7.png" class=".home_img">
<img src="${root}/res/photo/K-045.png">
<img src="${root}/res/photo/K-049.png">
<img src="${root}/res/photo/K-053.png">
	

</body>
</html>
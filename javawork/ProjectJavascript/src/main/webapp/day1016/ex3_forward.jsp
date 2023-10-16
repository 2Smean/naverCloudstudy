<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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
<%
//jsp:param 으로 한글을 전달시 현재 페이지에서 엔코딩을 해줘야한다
	request.setCharacterEncoding("utf-8"); //부득이하게 한글을 보낼때 param으로는 한글을 안넣는게 좋다
	//jsp내부에는 주석을 넣으면 오류가 난다 왜인지는 모르겠음
%> 
<jsp:forward page="ex4_forward.jsp">
	<jsp:param value="../image/C7.png" name="photo"/>
	<jsp:param value="Hello안녕" name="msg"/>
</jsp:forward>
</body>
</html>
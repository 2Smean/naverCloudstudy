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
<%
	Cookie[] cookies=request.getCookies();
	boolean find=false;
	if(cookies!=null)
	{
		for(Cookie ck:cookies)
		{
			//저장된 쿠기 이름을 얻기 
			String name=ck.getName();
			if(name.equals("loginok")){
				find=true; //해당 쿠키가 존재하면 true
			}
			
		}
	}
%>
<body>


<%
	if(!find){%>
		<script type="text/javascript">
			alert("먼저 로그인을 해주세요");
			history.back();
		</script>
		<%}else{%>
		<pre style="width:500px;">
		"이제 미지의 영역은 뇌뿐입니다. 영상장치의 수준에 따라 각국의 연구성과는 달라질 겁니다." PET(양전자 방출 단층촬영 장치)를 세계 최초로 개발, 뇌영상 연구분야의 세계 3대 석학 가운데 한 사람으로 꼽히는 UC어바인 조장희(68) 교수는 쩌렁쩌렁한 목소리에 기백이 넘쳤다. 고희를 앞둔 나이가 무색할 정도였다.
		 한국과학기술원과 광주과학기술원의 초빙 석좌교수 시절(1978~98년)의 거침없는 성격은 변함이 없었고, 뇌과학의 미래에 대한 그의 확신은 여전했다. 조 교수는 자신의 마지막 연구 인생을 조국에서 불태울 수 있는 기회를 잡았다. 가천의대가 조 교수를 영입해 370억 원을 들여 최첨단 뇌과학연구소를 세우기로 한 것이다.
		  조 교수에게는 15년간 연봉 30만 달러를 보장하는 파격적인 조건을 제시했다. 조 교수가 맡게 될 뇌과학영상연구소는 뇌 속에서 벌어지는 미세한 현상을 손바닥 보듯 들여다볼 수 있는 방법과 장치를 개발하게 된다. 가장 우선적인 목표는 MRI(자기공명 영상장치)와 PET를 합친 영상장치의 세계 최초 개발이다.
		</pre>
		<br><br>
		<a href="loginmain.jsp">메인페이지로 이동</a>
		<%}
%>
</body>
</html>
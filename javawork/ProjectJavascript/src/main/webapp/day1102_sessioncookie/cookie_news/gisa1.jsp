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
		“우리는 왜 의식을 문제 삼는가?” 하는 질문은 본 논의의 큰 주제이다. 윌슨이 말하는 통섭: 지식의 대통합 은 의식의 물질적인 기반에 대한 탐구를 필요로 하기 때문에 앞의 질문을 뇌과학을 통해 살펴본다는 것은 결국 의식의 문제를 객관적인 근거 속에서 논의하기 위한 가능성을 살펴보기 위함이다.
		 즉, 의식을 어떻게 뇌과학으로 설명할 수 있겠는가 하는 것이다. 우리의 뇌는 지연된 반사와 더불어 실현되지 않은 반응들의 가상모임이 시나리오들을 형성하고, 이 시나리오들이 계속 이어지는 의식의 흐름을 ‘생각하는 뇌’라고 한다. 그러나 분과학문들을 소통시키면서 예측적 종합에 어떻게 도달할 수 
		 있을까라는 질문에 답하기 위해서는 합리적인 통섭을 원리를 이해할 수 있는 ‘설명하는 뇌’로 나아가야 한다. 본 논문은 ‘설명하는 뇌’를 더욱 객관적인 근거에서 논의할 수 있는 장을 마련하고, 통섭 속에서 의식을 논의할 수 있는 가능성을 모색하기 위한 것이다. 뿐만 아니라 의식 자체의 역사성과 복잡성 때문에
		  물리ㆍ화학적인 접근으로는 통섭하려는 노력에 한계가 있음도 지적하여, 통섭하려는 노력 자체를 반성의 측면에서 논의하기 위한 것이기도 하다.
		</pre>
		<br><br>
		<a href="loginmain.jsp">메인페이지로 이동</a>
		<%}
%>
</body>
</html>
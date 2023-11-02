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
		생물 학습에서의 자기조절은 여러 가지 인지적 과제 수행 시 관찰된 정보와 기존 도식의 합치 여부를 판단하여 평형을 유지하거나 불합치가 일어날 경우 피드백을 통해 새로운 대안적 도식을 생성하여 다시 평형 상태로 도달하는 일련의 과정이다. 자기조절은 일상 생활 뿐 아니라 과학 학습 과정에서도 중요한 역할을 하며 생물을 관찰한 결과나 특징을 중심으로 유연 관계가 비슷한 생물을 분류하며 새로운 과학적 지식을 구성해 나가는 과정에서도 필수적이다.
이 연구의 목적은 중등학생이 생명과학 학습 과정에서 자기조절 사고를 수행함에 따라 나타나는 두뇌 활성과 두뇌 연결망을 자기조절 단계 및 연령에 따라 규명하고, 학생의 인지구조와 두뇌에서 일어나는 자기조절 사고가 어떻게 발달하는지 파악하는 데 있다. 이를 위해 중학교 1학년, 중학교 3학년, 고등학교 2학년 학생 122명을 대상으로 경제적 수준과 사회, 문화적 배경이 비슷한 G1, G2, S, C시의 학생들로 표집하여 연구를 진행하였다. 두뇌를 측정하기 전, 생물과
 관련된 다양한 과제를 활용하여 생물 분류 학습 과정에서 일어나는 자기조절 사고의 특성과 과정을 파악하여 자기조절 사고를 1～5단계까지 설정하였다. 그리고 이에 알맞은 과제를 동물 2종, 식물 1종, 균류 1종으로 제작하여 블록 패러다임 방식으로 제시하였으며 단계별로 두뇌 활성과 두뇌 연결망을 측정하였다. 또 자기조절의 보편적인 사고 종류라 할 수 있는 동화, 갈등, 조절에 따라 학생들의 뇌의 어느 영역에서 활성이 일어나고 두뇌 연결망이 유의미하게 연결되는지 측정하였다.
  f-NIRS기법을 적용한 NIRSIT 기기를 이용하여 뇌과학적인 방법을 활용하였고, NIRSIT Analysis 프로그램과 NIRS-SPM 프로그램으로 분석하였다. 자기조절의 단계별 두뇌 활성 및 연결망 규명을 위해서 동물, 식물, 균류를 비슷한 생물끼리 분류하고 유연 관계를 선택하는 과제를 제시하였다. 생물 분류 과제를 활용한 자기조절 과정에서의 뇌 활동을 측정하고 연결망을 분석한 결과, 1～5단계의 사고에서는 각각의 사고 과정과 흐름, 행동 특성이 나타난다. 또한 각 사고의 특성과 맞아 떨어지는
   전두엽의 각 영역이 활성화되거나 비활성화 된다는 것을 확인하였다. 1, 2, 3단계에서는 OFC를 위주로 DLPFC와 VLPFC가 관여하고 4, 5단계에서는 FP가 특징적으로 활성을 감소시키는 등 자기조절 단계별 사고와 연관된 두뇌 활성 및 연결망이 나타났다.
		</pre>
		<br><br>
		<a href="loginmain.jsp">메인페이지로 이동</a>
		<%}
%>
</body>
</html>
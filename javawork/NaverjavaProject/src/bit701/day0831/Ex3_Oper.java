package bit701.day0831;

import java.util.Scanner;

public class Ex3_Oper {
// if , 삼항으로 풀어보기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//점수를 입력 받아서 1~100 점이 아닐 경우는 일단 프로그램 종료
		//90 이상은 합격, 80 이상은 "재시험" , 그 나머지는 "불합격" 
		//void는 return만 값이 없으므로 
		System.out.println("점수를 입력하세요");
		int score=sc.nextInt();
		if(score<1 || score>100)//if 뒤에 ;을 쓰면 안됨 코드 문제는 없음 ";"을 잘못 넣으면 아래 값 무조건 종료
		{
			System.out.println("잘못된 값 입력으로 종료합니다!!");
			return;//return은 원래 해당 메서드만 종료하는 명령어인데 main 메서드 종료는 곧 프로그램 종료를 의미 
			
		}
		System.out.println("입력된 점수 :"+score+"점");
		
		//if 문
		String msg="";
		if(score>=90)
			msg="합격";
		else if(score>=80)
			msg="재시험";
		else 
			msg="불합격";
		
		System.out.println("결과"+ msg);
		
		//조건 연산자
		msg=score>=90?"합격" : score>=80?"재시험":"불합격";
		System.out.println("결과"+msg);
	}

}

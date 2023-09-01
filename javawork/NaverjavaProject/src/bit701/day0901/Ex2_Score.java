package bit701.day0901;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex2_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *	이름,3과목의 점수(kor,eng,mat) 를 입력 받은 후 총점과 평균(소숫점 1자리 출력-NumberFormat)
		 *	그리고 등급을 출력(grade : 평균이 90이상이면 "Excellent!", 80 이상이면 "Good!!", 나머지는 "Try!"라고 출력
		 *	-if-else 사용해서 구해보세요 
		 */
		//선언 
		
		//입력
		
		//계산
		
		//출력
		
		
		Scanner sc=new Scanner(System.in);
		NumberFormat format=NumberFormat.getInstance();
		format.setMaximumFractionDigits(1);
		String name="";
		int kor=0, eng=0, mat=0, total=0;
		double avg=0;
		String grade="";
		
		//입력
		System.out.println("이름을 입력해주세요");
		name=sc.nextLine();
		System.out.println("점수를 입력하세요");
		kor=sc.nextInt();
		System.out.println("점수를 입력하세요");
		eng=sc.nextInt();
		System.out.println("점수를 입력하세요");
		mat=sc.nextInt();
		
		//계산
		total=kor+eng+mat;
		avg=total/3.0;
		if(avg>=90) grade="Excellent!";
		else if(avg>=80) grade="Good!";
		else grade="Try!";
		
		//출력
		System.out.println("이름 :+name");
		System.out.println("국어점수: "+kor+"점");
		System.out.println("영어점수: "+eng+"점");
		System.out.println("수학점수: "+mat+"점");
		System.out.println("총점: "+total+"점");
		System.out.println("평균: "+format.format(avg)+"점");
		System.out.println("평가"+grade);
		
		
		
		
		
//		풀다만것
//		int kor=0, eng=0, mat=0;
//		System.out.println("이름을 입력해주세요");
//		String name="";
//		name=sc.nextLine();
//		System.out.println("점수를 입력하세요");
//		kor=sc.nextInt();
//		System.out.println("점수를 입력하세요");
//		eng=sc.nextInt();
//		System.out.println("점수를 입력하세요");
//		mat=sc.nextInt();
//		
//		total=kor+eng+mat;

	}

}

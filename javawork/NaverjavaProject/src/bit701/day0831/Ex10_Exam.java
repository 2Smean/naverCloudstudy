package bit701.day0831;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex10_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 상품명Sting 과 수량int, 단가를 각각 입력 받은 후 총금액을 출력하시오
		 * 그리고 수량이 5개 이상일 경우 10프로 할인 된 최종 금액도 출력해주세요
		 * 
		 *  변수 if 조건연산자 쓰던 상관없다
		 *  (예)
		 *  상품명 : 딸기
		 *  수량 : 6
		 *  단가 : 1000
		 *  
		 *  총금액 : 6000 원
		 *  5개 이상 10프로 할인된 금액 : 5400원
		 */
		
		//강사님 풀이
		
		//선언
		Scanner sc=new Scanner(System.in);
		NumberFormat numFormat=NumberFormat.getInstance();
		String sangpum="";
		int su=0, dan=0,total=0;
		//입력
		System.out.println("상품명");
		sangpum=sc.nextLine();
		System.out.println("수량");
		su=sc.nextInt();
		System.out.println("단가");
		dan=sc.nextInt();
		//계산
		//총금액 
		total=su*dan;
		//출력 
		System.out.println("총금액= "+numFormat.format(total)+"원");
		
		//5개 이상 할인 받는 조건 추가
		if(su>=5) {
//			total=total*0.9//이렇게 하면 오류남 int 
			total=(int)(total*0.9);
			System.out.printf("5개 이상 10프로 할인된 금액 : %d 원\n", total);
			System.out.printf("5개 이상 10%% 할인된 금액 : %s 원\n",numFormat.format(total));//printf에서 퍼센트 (%)출력하고 싶을때 %% 라고 적으면 된다
		}
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("상품명을 입력하세요");
//		String address=sc.nextLine();
//
//		sc.nextLine();
//	
//		System.out.println("수량을 입력하세요!");
//		int n=sc.nextInt();
//		System.out.println("수량 = "+n);
//			
//		
//		sc.nextLine();
//		
//		System.out.println("단가를 입력하세요!");
//		int m=sc.nextInt();
//		System.out.println("단가 = "+m);
//		
//		int totalCost = n * m;
//		int dcCost = 0;
//		System.out.println("총금액 ="+ totalCost+"원");
//		if(n>=5) {
//			dcCost = totalCost * 9 / 10; System.out.println("5개 이상 10프로 할인된 금액 : "+ dcCost+"원");
//		}
//		
//		//1Ex)값을 찾는 접근법 :1.변수정하기  2.if 사용, 3.상품명:애플망고 , 4.수량 10개 구매 , 5.단가 : 1000, 6.변수5개 이상 구매시 10프로 할인
//		//일반적으로 단가는 총 가격을 상품의 수량으로 나눈 몫입니다. 만약 할인 쿠폰이 있다면 총 가격에서 할인 가격을 뺀 다음에 단가를 계산하세요
		
	}

}

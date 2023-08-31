package bit701d.day0831;

import java.util.Scanner;

public class Ex10_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 상품명 과 수량, 단가를 각각 입력 받은 후 총금액을 출력하시오
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
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("상품명을 입력하세요!");
		int name=sc.nextInt();
		System.out.println("상품명 = "+name);

		sc.nextLine();
	
		System.out.println("수량을 입력하세요!");
		int many=sc.nextInt();
		System.out.println("상품명 = "+many);
		
		sc.nextLine();
		
		System.out.println("단가를 입력하세요!");
		int money=sc.nextInt();
		System.out.println("상품명 = "+money);
		//값을 찾는 접근법 :1.변수정하기  2.if 사용, 3.상품명:애플망고 , 4.수량 10개 구매 , 5.단가 : 1000, 6.변수5개 이상 구매시 10프로 할인
		
	}

}

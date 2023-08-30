package bit701.day0830;
//syso control + space 출력문 자동완성

//printf:변환 기호에 의한 출력, 정수:%f, 문자:%c, 문자열%s


/*
 * 자바 실행 방법
 * 1. 우클릭 run as ->java application
 * 2. run as -> java application
 * 3. control +f11
 */

// 묶음 주석 처리 : control + /

//\n:줄넘김, \t:다음탭위치로 이동

public class DataEx01 {

	public static void main(String[] args) {

		System.out.print("apple\t");
		System.out.print("banana\t");
		System.out.println("orange\n");
		

		int age=23;
		double weight=56.712;
		char blood='A';
		String name="캐 서 린";
		System.out.printf("이름:%s\n\n",name);
		System.out.printf("나이:%d세\n\n",age);
		System.out.printf("몸무게:%fKg\n",weight);// %f : 소수점아래 6자리까지 출력
		System.out.printf("나이:%5.1fKg\n",weight);//%5.1f:전체자리수:5, 소수점자리수:1
		System.out.printf("혈액형:%c형\n",blood);
		System.out.println("=======================");
		System.out.printf("이름:%s\n혈액형:%c형\n나이:%d세\n",name, blood, age);
		
	}

}

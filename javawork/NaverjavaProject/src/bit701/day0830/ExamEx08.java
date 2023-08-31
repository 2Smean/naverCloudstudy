package bit701.day0830;

public class ExamEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//money 변수에 args[0] 값을 대입 후 (급여:백만단위:5674321)
		/*
		 *  출력
		 *  money : 5674321 원
		 *  만원짜리
		 *  천원짜리
		 *  백원짜리
		 *  십원짜리 
		 *  일원짜리
		 *  
		 *   : 산술연산자를 사용해서 출력해보세요
		 */
		int money=Integer.parseInt(args[0]);
		System.out.println("월급여:" + money);
		System.out.println("만원짜리" + money/10000+"장");
		System.out.println("천원짜리" + (money%10000)/1000+"장");
		System.out.println("백원짜리" + (money%1000)/100 +"개");
		System.out.println("십원짜리" + (money%100)/10+"개");
		System.out.println("일원짜리" + (money%10)+"개");
		
	
	}
	
	

}	


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
		
		String money=args[0];
		int money_value=Integer.parseInt(money);
		int abc=566;
		int a=5,b=6,c=7;
		int d=4;
		int e=3;
		int f=2;
		int g=1;
		
		System.out.printf(money);
		System.out.printf("money_10000 : %d\n\n\t",abc+g);
		System.out.printf("money_1000 : %d\n\n\t",a-g);
		System.out.printf("money_100 : %d\n\n\t",e*g);
		System.out.printf("money_10 : %d\n\n\t",d/f);
		System.out.printf("money_1 : %d\n\n\t",a%d);
		System.out.printf("money_10000 : %d\n\n money_1000 : %d\n money_100 : %d\n money_10 : %d\n money_1 : %d\n",abc+g,a-g,e*g,d/f,a%d);
	
	}

}

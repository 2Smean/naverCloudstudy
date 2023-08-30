package bit701.day0830;

public class OperEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비교 연산자와 논리 연산자, 결과값은 무조건 참(true), 거짓(false)
		int kor=100, eng=90, mat=100;
		System.out.println(kor>=80);// true
		System.out.println(kor>=80 || kor!=mat);//true, 뒤의 수식을 비교하지 않는다, 연산하지 않는다 앞에가true니까
		System.out.println(kor<80 || kor!=mat);//false, 앞이 거짓이므로, 뒤까지 비교한다
		System.out.println(kor>=80 && kor!=mat);//false
		System.out.println(kor<80 && kor!=mat);//false
		System.out.println(!(kor==mat));//kor 와 mat의 값은 같으므로 true 이지만 ! (부정)이므로 값은 false
		System.out.println(kor>=95 && eng>=95 && mat>=95);//하나라도 안맞으면 false
		System.out.println(kor>=95 && eng>=95 || mat>=95);// 뒤에 까지 계산해서 true
		System.out.println(kor>=95 || eng>=95 && mat>=95);// 앞에가 true 뒤는 false 앞에가 true 이므로 값은 true
		
		int year=2031;
		//위의 년도가 윤년인지 안닌지 알아보자 
		System.out.println(year%4==0 && year%100!=0 || year%400==0);
	}

}

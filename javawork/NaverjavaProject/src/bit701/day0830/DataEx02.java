package bit701.day0830;

public class DataEx02 {

	public static void main(String[] args) {
		/*args[n]에 Arguments값을 주고 싶다면 run Configurations들어가서
		*Arguments에 들어가고 공백으로 나눠줌.
		*/
		System.out.println(" 내 이름은 " +args[0]+" 입니다 ");
		System.out.println(" 우리집은 " +args[1]+" 입니다 ");
		System.out.println(" 내 혈액형은 " +args[2]+"형 입니다 ");
		System.out.println();
		System.out.println("실수형 데이타 타입 ");
		float f1=1234.567891234f;//4바이트 float 으로 값을 지정하려면 f추가 
		double f2=1234.567891234;
		System.out.println(f1);//.빼고 앞에서부터 8자리까지만 정확하게 출력
		System.out.println(f2);//15자리까지만 정확하게 출력
		
		//("")문자열을 의미함
		
		char ch1='A';
		char ch2='가';
		System.out.println(ch1);
		System.out.println(ch1);
	}

}

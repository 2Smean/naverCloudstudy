package bit701.day0830;

public class DataEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 0xa3;//10진수로 얼마일까요 ? 10*16+3=163
		System.out.println(a1);
		int a2 = 0xf4;// 10진수 F4 -> 10진수 : 15*16+4*1=244
		System.out.println(a2);
		int a3 = 0xa56;// 10진수 10*16^2+5*16+6=2646
		System.out.println(a3);
		// 0x 아스키 코드로 16진수로 해석하고 a값은 10 f 값은 15 이다
		//값*x진수+
		
		//8진수 
		int a4 = 045; // 앞에 0을 붙이면 8진수로 인식한다 : 4*8+5
		System.out.println(a4);// 10진수 값 : 37
	}

}

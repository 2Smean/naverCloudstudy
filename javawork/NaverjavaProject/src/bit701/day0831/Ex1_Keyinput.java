package bit701.day0831;

import java.util.Scanner;
// control + 1 이나 왼쪽의 X표시를 눌러서 원하는 것을 찾는다
public class Ex1_Keyinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new 로 객체를 생성, 이 변수를 인스턴스 변수라고 한다.
		//static 변수나 메소드는 new로 객체 생성하지지 않고 호출한다
//		System.out.println("3의 5승 :"+Math.pow(3, 5));
//		System.out.println("5,7중 가장 큰 것은? :"+Math.max(5, 7));
		//대표적으로 Math 클래스의 모든 메서드는 static이다
		Scanner sc=new Scanner(System.in);
		
		System.out.println("당신의 나이를 입력하세요");
		int age=sc.nextInt();
		System.out.println("응!! 나는 "+age+"세야!!");
		
		//숫자 입력 후 문자열을 입력 받는 경우 입력 안되는 현상 발생
		//숫자 입력 후 발생하는 엔터 값이 버퍼에 저장되는데 문자열 입력시 
		//이 버퍼를 먼저 읽고 없을 경우 키보드로 읽는다.
		
		//방법 1 : 버퍼의 엔터문자를 먼저 읽어서 없앤다.
		sc.nextLine();
		//방법 2 : 숫자를 읽을 경우도 무조건 nextLine 으로 문자열로 입력 후 변환해서 사용한다.
		
		
		System.out.println("이름을 입력하세요");
		String name=sc.nextLine();//한줄 전체를 읽어온다
		System.out.println("내 이름은"+name+"입니다");
		//런타임 오류 : 수를 적어야하는데 글자를 넣었을 떄 
		//코드는 틀리지 않았지만 출력에서 오류 발생 
		
	}

}

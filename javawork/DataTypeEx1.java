public class DataTypeEx1{
     public static void main(String []args)
     {
	// 이 라인은 비실행문입니다
	/*
		2023.08.30 
		데이타 타입 예제
	*/
	//byte 는 1byte 크기의 정수형 타입입니다
	//크기는 -128~127 의 숫자만 저장이 가능합니다
	byte a=127;
	System.out.println("a="+a);

	byte b=(byte)200; //오류 발생, 강제 형 변환
	System.out.println("b="+b); //강제 형 변환했을 경우 값 손실 발생, -56

	// 실행시 인자(매개변수)로 넘어오는 문자열을 확인해보자
	System.out.println(args[0]); //배열의 첫 문자열 출력
      }	
}
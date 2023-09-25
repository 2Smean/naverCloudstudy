package bit701.day0919;

public class Circle { //main을 만들기 전에 Circle을 설계하는데 class 는
					  //쓸데없는 것을 만들면안되고 본질적인것을 만들어야 한다
	public int radius; //Circle을 이루는 본질적인것 반지름 
	public String name; //Circle 의 이름 
	
	public Circle() { //생성자 
		
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {//main 함수가 실행되기 전에는 세상에 아무것도 존재하지 않는다
		Circle pizza; // Circle 객체를 가리킬 레퍼런스 변수 
		pizza = new Circle(); //static 이 생기는 것이 아닌 static 멤버가 아닌것들만 생긴다 pizza가 Circle( 을 가르킴
		pizza.radius=10;
		pizza.name ="자바피자";
		double area = pizza.getArea();
		System.out.println("피자의 면적은 "+ area);
	}
}

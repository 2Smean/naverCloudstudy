package bit701.day0926;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
//	public void draw() {  //상속받았기 때문에 존재하지만 컴파일러에 의해 무시된다 
//		System.out.println("Shape");
//	}
	public void draw(int x) { //오버라이딩
		
		System.out.println("Line"); //오버라이딩이 우선된다
	}
}

class Circle extends Shape {
	public void draw() { //오버라이딩
		System.out.println("Circle");
	}
}

class Rect extends Shape {
	public void draw() { //오버라이딩
		System.out.println("Rect");
	}
}

public class OverEx {

	public static void print(Shape p) { // p는 Shape 객체이거나 Shape을 상속받은 객체에 대한 레퍼런스이다
		
	}
	public static void main(String[] args) {
		Line line = new Line();
		Shape shape = line; // 업캐스팅 line 객체를 shape 타입의 레퍼런스가 가리키게 되었다
		
		line.draw(); //Line 클래스의 draw() 호출
		shape.draw(); //Shape 클래스의 draw() 호출 -> 동적 바인딩에 의해 Line 클래스의 draw() 실행
		
		print(shape);
		print(shape);
		
	}

}

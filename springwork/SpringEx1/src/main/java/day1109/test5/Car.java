package day1109.test5;

public class Car {
	Tire tire; 
	
	public Car(Tire tire) { //부모 인터페이스 주입되는것( Canada , Korea ) 에따라 다른 값이 나온다
		this.tire=tire; 
	}
	
	public void myCarInfo()
	{
		System.out.println("내 차의 타이어는 " +tire.getTireName()+"입니다");
	}
}

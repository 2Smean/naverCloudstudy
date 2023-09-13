package bit701.day0913;

interface RemoteControl
{
	//상수
	int MAX_VOLUME=10;
	int MIN_VOLUME=10;

	//추상 메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);

	//jdk8 에서 추가된 기능
	//디폴트 인스턴스 메서드-기능 구현 가능하다
	default void setMute(boolean mute)
	{
		if(mute) {
			System.out.println("무음 처리합니다");
			setVolume(MAX_VOLUME);
		}else {
			System.out.println("무음 해제합니다");
		}
	}
}

class Telecision implements RemoteControl
{
	private int volume;


	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다!");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다!");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<MIN_VOLUME) {
			this.volume=MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 볼륨은 "+this.volume+"입니다");
	}

}

public class Book348 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc=null;
		rc=new Telecision();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		//디폴트 메서드 호출
		rc.setMute(false);
		rc.setMute(true);
		
		RemoteControl rc2=null;//인터페이스라 생성할 수 없다
//		rc2.setMute(false);//반드시 구현하는 클래스가 있어야만 호출이 가능하다

	}

}

package ch08.exam01;

public class Audio implements RemoteControl {
	@Override
	public void setVolume(int volume) {	//인터페이스 메서드가 public이기 때문에 재정의 할때는 public
		// TODO Auto-generated method stub
		System.out.println("Audio 볼륨을 "+ volume + "로 조정합니다.");
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio 끕니다");
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio 켭니다");
	}
}

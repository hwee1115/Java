package ch08.exam02;

public class Example {
	
	public static void method(RemoteControl rc) {	//매개변수 인터페이스로 사용할 수 있는 클래스
		//인터페이스의 설명대로만 사용하는 코드
		rc.turnOff();		//다형성
		rc.turnOn();		//다형성
		rc.setVolume(5);	//다형성
	}

	public static void main(String[] args) {
		RemoteControl rc = new Audio();
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(5);
		
		method(new Television());
		method(new Audio());
	}

}

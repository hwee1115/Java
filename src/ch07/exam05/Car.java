package ch07.exam05;

public class Car {	//클래스에 final은 아예 클래스의 상속이 불가능
	//field
	//constructor
	//method
	public final void stop() {	//final이 붙으면 상속을 하지 못함
		System.out.println("멈춥니다.");
	}
	
	public void run() {
		System.out.println("달립니다.");
	}
}

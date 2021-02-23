package ch08.exam03;

public class Car implements Flyable,Shipable {
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	public void fly() {
		System.out.println("비행합니다.");
	}
	
	public void anchor() {
		System.out.println("정박합니다.");
	}
	
	public void sailing() {
		System.out.println("항해합니다.");
	}
}

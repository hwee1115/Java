package ch07.exam05;

public class SportsCar extends Car {
	//stop은 오버라이딩 불가능(final로 선언했기 때문)
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("빨리 달립니다.");
	}
}

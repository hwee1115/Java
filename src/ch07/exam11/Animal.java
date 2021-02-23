package ch07.exam11;

public abstract class Animal {	//추상클래스는 상속을 통해서만 사용 가능
	public String name;
	public String kind;
	
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
	public void eat() {
		System.out.println("먹습니다.");
	}
	
	public abstract void sound();	//자식에서 오버라이딩 해줘야한다.

}

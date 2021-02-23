package ch07.exam03;

public class Child extends Parent {
	//field
	//Constructor
	public Child(String firstName) {
		super("김",firstName);	//첫줄 작성, 명시적으로 부모 생성자를 호출 할 수 있다.
		System.out.println("child 객체 생성");
	}
	//Method
	public void method2() {
		System.out.println("method2() 실행");
	}
	
	@Override	//어노테이션(실수를 줄여준다)
	public void sound() {	//넒은 의미로의 조건제한가능 좁은 의미 x 부모public 자식 default 불가능,자식이 더 큰 경우는 가능
		System.out.println("싫어요");
	}
}

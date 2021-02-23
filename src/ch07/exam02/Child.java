package ch07.exam02;

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
}

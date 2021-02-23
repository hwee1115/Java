package ch07.exam01;

public class Parent {
	//field
	public int field1;
	//Constructor
	public Parent() {
		System.out.println("Parent 객체 실행");	//child객체 호출 시 parent생성자도 호출
	}
	//Method
	public void method1() {
		System.out.println("method1() 실행");
	}
}

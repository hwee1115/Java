package ch07.exam02;

public class Parent {
	//field
	public String lastName;
	public String firstName;
	//Constructor
	public Parent(String lastName, String firstName) {
		System.out.println("Parent 객체 실행");	//child객체 호출 시 parent생성자도 호출
		this.lastName = lastName;
		this.firstName=firstName;
	}
	//Method
	public void method1() {
		System.out.println("method1() 실행");
	}
}

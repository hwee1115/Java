package ch07.exam02;

public class Parent {
	//field
	public String lastName;
	public String firstName;
	//Constructor
	public Parent(String lastName, String firstName) {
		System.out.println("Parent ��ü ����");	//child��ü ȣ�� �� parent�����ڵ� ȣ��
		this.lastName = lastName;
		this.firstName=firstName;
	}
	//Method
	public void method1() {
		System.out.println("method1() ����");
	}
}

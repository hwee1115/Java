package ch07.exam02;

public class Child extends Parent {
	//field
	//Constructor
	public Child(String firstName) {
		super("��",firstName);	//ù�� �ۼ�, ��������� �θ� �����ڸ� ȣ�� �� �� �ִ�.
		System.out.println("child ��ü ����");
	}
	//Method
	public void method2() {
		System.out.println("method2() ����");
	}
}

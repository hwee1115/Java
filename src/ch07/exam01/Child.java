package ch07.exam01;

public class Child extends Parent {
	//field
	public int field2;
	//Constructor
	public Child() {
		super();	//�ڵ����� �θ� ������ ȣ���ڵ�
		System.out.println("child ��ü ����");
	}
	//Method
	public void method2() {
		System.out.println("method2() ����");
	}
}

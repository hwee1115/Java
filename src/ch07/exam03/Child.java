package ch07.exam03;

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
	
	@Override	//������̼�(�Ǽ��� �ٿ��ش�)
	public void sound() {	//���� �ǹ̷��� �������Ѱ��� ���� �ǹ� x �θ�public �ڽ� default �Ұ���,�ڽ��� �� ū ���� ����
		System.out.println("�Ⱦ��");
	}
}

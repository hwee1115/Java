package ch07.exam07;

public class Example {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		child.method1();
		child.method2();
		child.method3();
		
		parent.method1();
		parent.method2(); // ��ӵ� �ڽĿ��� �������̵� �Ʊ� ������ Parent��ü���� ��ӵ� �ڽ��� method2�� ȣ��
		//parent.method3();
	}

}

package ch07.exam10;

public class Example {

	public static void main(String[] args) {
		Parent parent = new Child();	//child��ü �ʵ�� �޼��� �������
		parent.field1=5;
		parent.method1();
		parent.method2();
		
		Child child=(Child)parent;
		child.field2=5;
		child.method1();
		child.method2();
		child.method3();
	
	}

}

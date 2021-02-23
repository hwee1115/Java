package ch07.exam01;

public class Example {

	public static void main(String[] args) {
		Child child = new Child();
		child.field1=10; //상속으로 받은 필드
		child.field2=20;
		child.method1();//상속으로 받은 메소드
		child.method2();

	}

}

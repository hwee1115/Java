package ch07.exam02;

public class Example {

	public static void main(String[] args) {
		Child child = new Child("명휘");
		System.out.println(child.firstName);
		System.out.println(child.lastName);
		child.method1();//상속으로 받은 메소드
		child.method2();

	}

}

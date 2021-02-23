package ch07.exam07;

public class Example {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		child.method1();
		child.method2();
		child.method3();
		
		parent.method1();
		parent.method2(); // 상속된 자식에서 오버라이딩 됐기 때문에 Parent객체여도 상속된 자식의 method2를 호출
		//parent.method3();
	}

}

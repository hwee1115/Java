package ch11.exam04;

public class Example {

	public static void main(String[] args) {
		
		Class var1 =A.class;	//A클래스가 로딩된 번지
		A a = new A();
		Class var2 = a.getClass();
		System.out.println(var1);

	}

}

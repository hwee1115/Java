package ch06.exam04;

public class Example {

	public static void main(String[] args) {
		Korean korean = new Korean("hwee","010xxxxxxx");
		System.out.println(korean.name);
		System.out.println(korean.ssn);
		
		Korean korean2 = new Korean("hwee","010xxxxxxx");
		System.out.println(korean2.name);
		System.out.println(korean2.ssn);
	}

}

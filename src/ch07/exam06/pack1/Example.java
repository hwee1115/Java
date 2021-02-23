package ch07.exam06.pack1;

public class Example {

	public static void main(String[] args) {

		Parent parent = new Parent();	//부모에서 자식클래스로 접근가능
		parent.field1 = 10;
		parent.parentMethod();
		
		
		
	}

}

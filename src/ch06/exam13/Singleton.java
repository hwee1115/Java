package ch06.exam13;

public class Singleton {
	//Field
	private static Singleton singleton = new Singleton();	//같은 객체를 참조하기 위한 방법
	
	//Constructor
	private Singleton() {
		
	}
	
	//Method
	static Singleton getInstance() {
		//Singleton s= new Singleton();
		return singleton;
	}
}

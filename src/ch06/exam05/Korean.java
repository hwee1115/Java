package ch06.exam05;

public class Korean {
	String nation = "�ѱ�";
	String name;
	String ssn;
	int age;

	//Constructor overloading
	Korean(){
		
	}
	Korean(String name){
		
		this.name=name;
	}

	Korean(String name, String ssn) {
		
		this.name=name;
		this.ssn=ssn;
	}
	Korean(String name, String ssn,int age) {
		System.out.println("Korean(String name, String ssn, int age) ����");
		this.name=name;
		this.ssn=ssn;
		this.age = age;
	}
}

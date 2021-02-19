package ch06.exam06;

public class Korean {
	String nation = "한국";
	String name;
	String ssn;
	int age;

	//Constructor overloading
	Korean(){
		this("아무개","00000-00000",1);	//26번째 줄의 생성자 실행
	}
	Korean(String name){
		this(name, "00000-00000",1);
	}

	Korean(String name, String ssn) {
		this(name,ssn,1);
	}
	Korean(String name, String ssn,int age) {
		System.out.println("Korean(String name, String ssn, int age) 실행");
		this.name=name;
		this.ssn=ssn;
		this.age = age;
	}
}

package ch06.exam06;

public class Korean {
	String nation = "�ѱ�";
	String name;
	String ssn;
	int age;

	//Constructor overloading
	Korean(){
		this("�ƹ���","00000-00000",1);	//26��° ���� ������ ����
	}
	Korean(String name){
		this(name, "00000-00000",1);
	}

	Korean(String name, String ssn) {
		this(name,ssn,1);
	}
	Korean(String name, String ssn,int age) {
		System.out.println("Korean(String name, String ssn, int age) ����");
		this.name=name;
		this.ssn=ssn;
		this.age = age;
	}
}

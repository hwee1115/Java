package ch06.exam11;

public class User {
	//Field
	String id;
	String name;
	String password;
	static String nation ="�ѱ�";
	//Constructor �ν��Ͻ��� ����� �� �� ����
	User(String name){
		this.name =name;
	}
	
	//Mehtod
	static void info() {	//static �ȿ��� ��ü �ȿ� �����ϴ� �ʵ� ��� �Ұ���
		System.out.println("��� User�� �ѱ����Դϴ�.");
	}
	void login() {
		System.out.println(name + "���� �α����մϴ�.");
	}
	void logout() {
		System.out.println(name + "���� �α׾ƿ��մϴ�.");
	}
}

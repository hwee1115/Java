package ch06.exam11;

public class User {
	//Field
	String id;
	String name;
	String password;
	static String nation ="한국";
	//Constructor 인스턴스의 멤버가 될 수 없음
	User(String name){
		this.name =name;
	}
	
	//Mehtod
	static void info() {	//static 안에는 객체 안에 존재하는 필드 사용 불가능
		System.out.println("모든 User는 한국인입니다.");
	}
	void login() {
		System.out.println(name + "님이 로그인합니다.");
	}
	void logout() {
		System.out.println(name + "님이 로그아웃합니다.");
	}
}

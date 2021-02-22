package ch06.exam10;

public class Changer {
	void change(int value) {
		value =2;
	}
	
	void change(String value) {
		value="B";
	}
	
	void change(int[] arr2) {
		arr2[0] =2;
	}
	
	void change(String[] arr) {
		arr[0] ="B";
	}
	
	void  change(Member m) {
		m.age=2;
	}
}

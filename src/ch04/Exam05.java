package ch04;

public class Exam05 {

	public static void main(String[] args) {
		//�ֻ����� ���� ������ �� ���
		int value = (int)(Math.random()*6)+1;
		System.out.println(value);
		if(value%2==0) {
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}

}

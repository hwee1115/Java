package ch04;

public class Exam05 {

	public static void main(String[] args) {
		//주사위를 던져 나오는 수 얻기
		int value = (int)(Math.random()*6)+1;
		System.out.println(value);
		if(value%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	}

}

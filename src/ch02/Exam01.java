package ch02;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte var1 = 1; //-128~127
		short var2 = 10000;
		int var3 = 2000000000;
		long var4 = 20000000000L;
		
		//문자 타입의 변수 선언과 값 저장
		char var9 = 65;
		char var10 = 'A';
		System.out.println("var9 = " + var9);
		System.out.println("var10 = " + var10);
		//실수 타입의 변수
		//정밀도 차이 double이 더 정밀
		float var5 = 0.123456789f;
		double var6 = 0.123456789;
		System.out.println("var5 =" + var5);
		System.out.println("var6 =" + var6);

		//논리 타입의 변수
		boolean var7 = true;
		boolean var8 = false;
		

	}

}

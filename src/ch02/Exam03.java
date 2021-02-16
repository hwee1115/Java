package ch02;

public class Exam03 {

	public static void main(String[] args) {
		//int 타입 이하의 피연산자의 연산은 결과과 int
		byte var1 = 10;
		byte var2 = 20;
		//byte var3 = var1 + var2; ( 연산의 결과가 int로 나오므로 오류)
		int var3 = var1 + var2;
		System.out.println(var3);
		
		int var4 = 10;
		long var5 =20;
		//int var6 = var4 + var5; (연산의 결과가 long으로 나오므로 오류)
		long var6 = var4+var5;
		
		int var7 = 10;
		double var8 = 1.5;
		double var9= var7+var8;

	}

}

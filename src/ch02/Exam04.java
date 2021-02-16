package ch02;

public class Exam04 {

	public static void main(String[] args) {
		
		//문자열  => 숫자(정수, 실수)
		
		//문자열을 String타입 변수에 저장
		String var1 = "10";
		System.out.println("var1: " + var1);
		
		//문자열과 숫자가 + 가되면 문자열 결합
		String var2 = var1 + 5;
		System.out.println(var2);
		
		//문자열을 숫자로 변환
		int var3 = Integer.parseInt(var1) + 5;
		System.out.println("var3: "+var3);
		
		//문자열을 실수로 변경해서 연산
		String var4 = "10.5";
		double var5 = Double.parseDouble(var4)+2.3;
		System.out.println(var5);
		
		//숫자 => 문자열
		int var6 =3;
		String var7 = ""+ var6;
		String var8 = String.valueOf(var6);

	}

}

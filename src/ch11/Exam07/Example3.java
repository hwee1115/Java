package ch11.Exam07;

public class Example3 {

	public static void main(String[] args) {
		
		//Integer var1 = new Integer(500);
		//Integer var2 = new Integer(500);
		//Integer var1 = 500;
		//Integer var2 = 500;
		
		Integer var1 =127;
		Integer var2 =127;
		System.out.println(var1==var2);	//false 값의 범위에 따라서 다른 값
		System.out.println(var1.equals(var2));

	}

}

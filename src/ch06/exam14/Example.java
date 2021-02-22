package ch06.exam14;

public class Example {

	public static void main(String[] args) {
		System.out.println(Korean.NATION);
		//Korean.NATION = "미국";
		
		Korean k1 = new Korean("123456-1234567");
		//k1.ssn="555555-55555";	(x)이미 한번 값을 넣어줬기 때문에 다시 값을 넣어주는 것은 불가능
		
		System.out.println(Math.PI);
		double area = 10*10*Math.PI;
	}

}

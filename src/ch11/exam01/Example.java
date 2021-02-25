package ch11.exam01;

public class Example {

	public static void main(String[] args) {
		Member m1  = new Member("winter", "늦겨울");
		Member m2  = new Member("winter", "늦겨울");
		
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));	//object이 갖고있는 equals는 위에와 똑같다
		

	}

}

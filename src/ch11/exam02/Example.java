package ch11.exam02;

import java.util.Date;

public class Example {

	public static void main(String[] args) {
		Object var1  = new Object();
		System.out.println(var1.toString());//java.lang.Object@15db9742 <-숫자부터메모리 주소에 대한정보
		
		Date var2 = new Date();
		System.out.println(var2.toString());//Thu Feb 25 10:37:05 KST 2021
		
		String var3 = "abc";
		System.out.println(var3.toString());//abc;
		
		Member var4 = new Member("winter", "늦겨울");
		System.out.println(var4.toString());
		System.out.println(var4);	//println은 객체가 들어면 무조건 toString을 사용하여 출력
		
		String result = var4.toString()/*toString생략가능*/ + "=> spring: 봄둘이";
		System.out.println(result);   	//var4는 toString에서 리턴된값으로
	}

}

package ch11.exam02;

import java.util.Date;

public class Example {

	public static void main(String[] args) {
		Object var1  = new Object();
		System.out.println(var1.toString());//java.lang.Object@15db9742 <-���ں��͸޸� �ּҿ� ��������
		
		Date var2 = new Date();
		System.out.println(var2.toString());//Thu Feb 25 10:37:05 KST 2021
		
		String var3 = "abc";
		System.out.println(var3.toString());//abc;
		
		Member var4 = new Member("winter", "�ʰܿ�");
		System.out.println(var4.toString());
		System.out.println(var4);	//println�� ��ü�� ���� ������ toString�� ����Ͽ� ���
		
		String result = var4.toString()/*toString��������*/ + "=> spring: ������";
		System.out.println(result);   	//var4�� toString���� ���ϵȰ�����
	}

}

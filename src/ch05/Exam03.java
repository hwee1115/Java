package ch05;

import java.util.Arrays;

public class Exam03 {

	public static void main(String[] args) {
		int[] scores1 = {90,85,95};
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);
		
		//�迭 ���� �� ��� ����
		int[] scores2 = null;
		scores2 = new int[] {10,20,30};
		
		//�޼ҵ� ȣ��
		add(scores2);
		add(new int[] {15,20,30});
	}
	
	public static void add(int[] arr) {
		System.out.println("��: "+ Arrays.toString(arr));
		
	}

}

package ch05;

import java.util.Arrays;

public class Exam05 {

	public static void main(String[] args) {
		int[] arr =new int[3];
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		arr[0] = 90;
		arr[1] = 80;
		arr[2] = 95;
		
		//배열 항목의 값을 읽고 출력
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//배열 항목 비교
		System.out.println(arr[0]==90);
		
	}
}
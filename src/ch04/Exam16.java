package ch04;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		while(true) {

			System.out.print("숫자1: ");
			int num1 = Integer.parseInt(scanner.nextLine());
			
			if(num1==0) 
				break;
			
			System.out.print("숫자2: ");
			int num2 = Integer.parseInt(scanner.nextLine());
			//double num2 = Double.parseDouble(scanner.nextLine());
			
			int result = num1 + num2;
			System.out.println("결과: " + result);
			
		}
	}

}

package ch04;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		while(true) {
			System.out.print("�Է�: ");
			String data = scanner.nextLine();

			System.out.println("���: "+data);
			
			if(data.equals("���ɽð�"))
				break;
		}
	}

}

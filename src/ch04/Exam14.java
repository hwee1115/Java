package ch04;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for(int i=0; i<3; i++) {
			System.out.print("�Է�: ");
			String data = scanner.nextLine();

			System.out.println("���: "+data);
		}
	}

}

package ch04homework;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run =true;
		
		int balance=0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------");
			System.out.print("����> ");
			
			int num = Integer.parseInt(scanner.nextLine());
			
			if(num==1) {
				System.out.print("���ݾ�> ");
				int add = Integer.parseInt(scanner.nextLine());
				balance+=add;
	 		}else if(num==2) {
	 			System.out.print("��ݾ�> ");
				int minus = Integer.parseInt(scanner.nextLine());
				balance-=minus;
			}else if(num==3) {
				System.out.println("�ܰ�> "+ balance);
			}else {
				System.out.println("���α׷� ����");
				break;
			}
		}
		
	

	}

}

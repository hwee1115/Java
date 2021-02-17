package ch04homework;

public class Exercise04 {

	public static void main(String[] args) {

		while(true) {
			int value1 = (int)(Math.random()*6)+1;
			int value2 = (int)(Math.random()*6)+1;
			int	sum=value1+value2;
			if(sum==5) {
				System.out.println("("+value1+"," +value2+")");
				break;
			}else{
				System.out.println("("+value1+"," +value2+")");
			}

		}

	}

}

package ch07.exam08;

public class Example {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
		car.t1 = new TireChild1();	//child�� ������ ��  run()����
		car.t2 = new TireChild2();
		car.run();

	}

}

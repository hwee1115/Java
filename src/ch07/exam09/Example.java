package ch07.exam09;

public class Example {

	public static void main(String[] args) {
		//매개변수의 다형셩
		Driver driver = new Driver();
		driver.drive(new Vehicle());
		driver.drive(new Bus());
		driver.drive(new Taxi());

	}

}

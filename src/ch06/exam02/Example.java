package ch06.exam02;

public class Example {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old);
		System.out.println(myCar.speed);
		
		//�ʵ��� ���� ����
		myCar.company = "�����ڵ���";
		myCar.model = "�׷���";
		myCar.price=50000000;
		myCar.old=true;
		myCar.speed=60;
	}

}

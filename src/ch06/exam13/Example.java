package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		//Singleton result1 = new Singleton();	(x)
		//Factory Method �̿��ؼ� ��ü ���	//Factory Method�� static(��ü�� �ҷ����� �ʱ� ����)
		Singleton result2 = Singleton.getInstance();
		Singleton result3 = Singleton.getInstance();
		if(result2==result3) {
			System.out.println("���� ��ü�� �����Ѵ�.");
		}else {
			System.out.println("�ٸ� ��ü�� �����Ѵ�.");
		}
	}

}

package ch06homework.ch16;

public class SingletonExample {

	public static void main(String[] args) {
		//Singleton obj1 = new Singleton();	�����Ͽ���
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if(obj1 ==obj2) {
			System.out.println("���� ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
		}
	}

}

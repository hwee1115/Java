package ch08.exam02;

public class Example {
	
	public static void method(RemoteControl rc) {	//�Ű����� �������̽��� ����� �� �ִ� Ŭ����
		//�������̽��� �����θ� ����ϴ� �ڵ�
		rc.turnOff();		//������
		rc.turnOn();		//������
		rc.setVolume(5);	//������
	}

	public static void main(String[] args) {
		RemoteControl rc = new Audio();
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(5);
		
		method(new Television());
		method(new Audio());
	}

}

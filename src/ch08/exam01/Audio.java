package ch08.exam01;

public class Audio implements RemoteControl {
	@Override
	public void setVolume(int volume) {	//�������̽� �޼��尡 public�̱� ������ ������ �Ҷ��� public
		// TODO Auto-generated method stub
		System.out.println("Audio ������ "+ volume + "�� �����մϴ�.");
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio ���ϴ�");
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio �մϴ�");
	}
}

package ch08.exam02;

public class Audio implements RemoteControl {
	private int volume;
	@Override
	public void setVolume(int volume) {	//�������̽� �޼��尡 public�̱� ������ ������ �Ҷ��� public
		if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}
		
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}
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

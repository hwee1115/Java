package ch08.exam01;

public class Example {

	public static void main(String[] args) {
		RemoteControl rc = new Audio();
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(5);
	}

}

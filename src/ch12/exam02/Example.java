package ch12.exam02;

public class Example {

	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		
		//네트워크 작업을 하는 스레드 생성과 실행
		Thread thread1 = new NetworkTask();	//매개변수로 Runnable로 구현한 객체
		thread1.start();//start를 호출하지만 객체의 run()을 실행
		//음악 작업을 하는 스레드 생성과 실행
		Thread thread2 = new MusicTask();;
		thread2.start();
		//채팅 작업을 하는 스레드 생성과 실행
		Thread thread3 = new Thread() {	//Thread()의 자식클래스 생성, 익명 자식클래스(자식객체)
			@Override
			public void run() {
				while(true) {
					System.out.println("채팅작업을 시작합니다.");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}};
		while(true) {
			System.out.println("메인 작업을 합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

	}

}

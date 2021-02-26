package ch12.exam01;

public class NetworkTask implements Runnable {
	 
	@Override
	public void run() {
		while(true) {
			System.out.println("네트워크 통신을 합니다.");
			try {
				Thread.sleep(1000);//잠깐정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
	}
}

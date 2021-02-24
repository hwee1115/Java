package ch10.exam07;

public class Example {

	public static void main(String[] args) {
		
		try {
			method();
		}catch(Exception e) {
			//예외 메시지별로 예외처리를 할 때 사용
			String message = e.getMessage();
			System.out.println(message);
			/*	if(message.contains("0001")) {
					//...
				}else {
					//..
				}*/
			//디버깅할 때 사용할 수 있는 예외 정보
			System.out.println(e.toString());
			e.printStackTrace(); //예외가 어디서부터 발생해서 어떤 이유로 나타났는지 상세하게
		}
		
	}
	
	public static void method() throws NoAccountException {
		throw new NoAccountException("0001: 입금 계좌가 없음");
	}

}

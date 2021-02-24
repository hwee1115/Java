package ch10.exam06;

public class Account {
	public void deposit(String account, int money) throws NoAccountException {
		if(account == null) {
			//예외 발생 코드
			throw new NoAccountException("입금 계좌가 없습니다."); 	//예외가 발생된다는 것만 알려준다.("")예외의 정확한 이유 작성
		}
		System.out.println("입금 성공");
	}
	
	public void withdraw(String account, int money) throws NoAccountException,BalanceLackExcpetion {
		int balance = 10000;
		if(account ==null) {
			throw new NoAccountException("출금 계좌가 없습니다."); 
		}else if(money>balance) {
			throw new BalanceLackExcpetion("잔고가 부족합니다.");
		}else {
			System.out.println("출금 완료");
		}
	}
}

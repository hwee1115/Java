package ch10.exam06;

public class Account {
	public void deposit(String account, int money) throws NoAccountException {
		if(account == null) {
			//���� �߻� �ڵ�
			throw new NoAccountException("�Ա� ���°� �����ϴ�."); 	//���ܰ� �߻��ȴٴ� �͸� �˷��ش�.("")������ ��Ȯ�� ���� �ۼ�
		}
		System.out.println("�Ա� ����");
	}
	
	public void withdraw(String account, int money) throws NoAccountException,BalanceLackExcpetion {
		int balance = 10000;
		if(account ==null) {
			throw new NoAccountException("��� ���°� �����ϴ�."); 
		}else if(money>balance) {
			throw new BalanceLackExcpetion("�ܰ� �����մϴ�.");
		}else {
			System.out.println("��� �Ϸ�");
		}
	}
}

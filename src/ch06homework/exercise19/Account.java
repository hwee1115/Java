package ch06homework.exercise19;

public class Account {
	
	  static final int MIN_BALANCE=0;
	  static final int MAX_BALANCE=1000000;
	  static int balance;
	 
	  
	public static int getBalance() {
		return balance;
	}
	
	public int setBalance(int balance) {
		if(balance<MIN_BALANCE) {
			return balance;
		}else if(balance >MAX_BALANCE) {
			return balance;
		}else {
			return this.balance=balance;
		}
	}
	
	 
	 

}

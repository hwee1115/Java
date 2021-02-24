package ch10.exam06;

public class BalanceLackExcpetion extends Exception {
	public BalanceLackExcpetion() {}
	public BalanceLackExcpetion(String message) {
		super(message);
	}
}

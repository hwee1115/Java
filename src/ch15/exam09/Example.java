package ch15.exam09;

import java.util.Stack;

public class Example {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		stack.push("Ȧ�浿");
		stack.push("Ȧ�漭");
		stack.push("Ȧ�泲");
		
		while(!stack.empty()){
			String item=stack.pop();
			System.out.println(item);
		}
		
		


	}

}

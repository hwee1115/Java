package ch15.exam09;

import java.util.LinkedList;
import java.util.Queue;

public class Example2 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("�P�浿");
		queue.offer("�P�漭");
		queue.offer("�P�泲");
		
		while(!queue.isEmpty()) {
			String item = queue.poll();
			System.out.println(item);
		}
		

	}

}

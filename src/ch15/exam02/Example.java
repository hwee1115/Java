package ch15.exam02;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		//Vector()->멀티쓰레드 환경
		//객체 저장
		list.add(new Board(1,"제목1"));
		list.add(new Board(2,"제목2"));
		list.add(new Board(3,"제목3"));
		System.out.println(list.size());
		
		//객체 얻기
		Board board1 = list.get(0);
		System.out.println(board1.getBno()+ ": " + board1.getTitle());
		Board board2 = list.get(1);//auto unboxing
		Board board3 = list.get(2);
		
		//반복 처리
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getBno()+ ": " + board.getTitle());
		}
		
		for(Board board : list) {	//Iterable
			System.out.println(board.getBno()+ ": " + board.getTitle());
		}
		
		//객체 제거
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());
		
		
	}

}

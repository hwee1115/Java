package ch06.exam08;

public class BoardService {
	//Field
	String[][] boards;
	int count=0;;
	
	//Constructor
	BoardService(int rows, int columns){
		boards = new String[rows][columns];
	}
	
	//Method
	
	int getNewBno() {
		return ++count;
	}
	void create(String title, String content, String writer, int hitcount) {
		int bno= getNewBno();
		String[] board = {
				""+bno,
				title,
				content,
				writer,
				String.valueOf(hitcount)
		};
		for(int i=0;i<boards.length;i++) {
			if(boards[i][0]==null) {
				boards[i]=board;
				break;
			}
		}
		
	}
	void showlist(){
		for(int i=0;i<boards.length;i++) {
			if(boards[i] == null) {
	            break;
	         }
			for(int k=0; k<5; k++) {
				System.out.println(boards[i][k]+"\t");
			}
			System.out.println();
		}
	}
	
	String[] read(int bno) {
		String[] result = null;
		String strBno = ""+bno;
		for(int i=0; i<100; i++) {
			if(boards[i][0] !=null) {
				if(boards[i][0].equals(strBno)) {
					result = boards[i];
					break;
				}
			}
		}
		return result;
	}
}

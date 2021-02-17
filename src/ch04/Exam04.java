package ch04;

public class Exam04 {

	public static void main(String[] args) {

		char grade = 'A';
		switch(grade) {
		case 'A':
			System.out.println("score >=90");
			break;
		case 'B':
			System.out.println("score >= 80");
			break;
		case 'C':
			System.out.println("score >= 70" );
		default:
			System.out.println("score=F");
		}

		//---------------------------------
		if(grade =='A') {
			System.out.println("score >=90");
		}else if(grade == 'B') {
			System.out.println("score >= 80");
		}else if(grade == 'C') {
			System.out.println("score >= 70" );
		}else {
			System.out.println("score=F");
		}

	}

}

package ch05;

public class Exam10 {

	public static void main(String[] args) {
		int[] scores1 = {85,90,95};
		int[] newScores1 = new int[scores1.length+2];
		
		System.arraycopy(scores1, 0, newScores1, 2, scores1.length);
		
		for(int i=0; i<newScores1.length; i++) {
			System.out.print(newScores1[i]+",");
		}

	}

}

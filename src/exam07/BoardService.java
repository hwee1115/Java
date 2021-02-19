package exam07;

public class BoardService {
	
	//field
	int count;
	//Constructor
	
	//Method
	int getNewBno() {
		return ++count;
	}
	
	void save(String title, String content) {
		int bno = getNewBno();
		System.out.println(bno+"저장합니다.");
		System.out.println(title + "저장합니다.");
		System.out.println(content + "저장합니다.");
	}
	
	int getSum(int[] values) {
		int result=0;
		for(int value : values) {
			result+=value;
		}
		return result;
	}
	
	int getSum2(int ...values) {
		int result=0;
		for(int value : values) {
			result+=value;
		}
		return result;
	}

}

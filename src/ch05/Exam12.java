package ch05;

public class Exam12 {

	public static void main(String[] args) {

		Season nowSeason = Season.WINTER;
		if(nowSeason == Season.SUMMER) {
			System.out.println("�½��ϴ�.");
		}else {
			System.out.println("�ƴմϴ�.");
		}
		//System.out.println(nowSeason);

		LoginResult loginResult = LoginResult.LOGIN_SUCCESS;
		if(loginResult == LoginResult.LOGIN_SUCCESS) {
			System.out.println("�α��� ����");
		}else if(loginResult==LoginResult.FAILURE_ID) {
			System.out.println("���̵� �ٽ��Է��ϼ���");
		}else {
			System.out.println("�н����尡 Ʋ���ϴ�.");
		}
	}

}

package ch10.exam07;

public class Example {

	public static void main(String[] args) {
		
		try {
			method();
		}catch(Exception e) {
			//���� �޽������� ����ó���� �� �� ���
			String message = e.getMessage();
			System.out.println(message);
			/*	if(message.contains("0001")) {
					//...
				}else {
					//..
				}*/
			//������� �� ����� �� �ִ� ���� ����
			System.out.println(e.toString());
			e.printStackTrace(); //���ܰ� ��𼭺��� �߻��ؼ� � ������ ��Ÿ������ ���ϰ�
		}
		
	}
	
	public static void method() throws NoAccountException {
		throw new NoAccountException("0001: �Ա� ���°� ����");
	}

}

package ch09.exam03;
//������  x,y�� b�� ����
public class A {
	public void method(final int x) {
		final int y= 2;	//�ڹ�8 ���� final���� ����
		//x=10; //�����߻� 	�Ű������� ���� ���� ���� Ŭ�������� ���� �� final
		//y=20; //���� ������ final
		class B {
			public void method() {
				int result = x+y;
			}
		}
	}
}

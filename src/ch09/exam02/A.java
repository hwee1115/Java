package ch09.exam02;

public class A {
	public class B{
		public int field;
		public B() {}
		public void method() {}
	}
	
	public static class C{
		public int field;
		public C() {}
		public void method() {}
	}
	
	public void method() {	//�޼ҵ� �ȿ� ������ X	//�� �޼ҵ�ȿ����� ���
		class D {
			public int field;
			public D() {}
			public void method() {}
		}
		
		D d = new D();	//�޼ҵ尡 ������ ���� �� ����
		d.field =1;		//�޼ҵ尡 ������ ���� �� ����
		d.method();		//�޼ҵ尡 ������ ���� �� ����
	}
}

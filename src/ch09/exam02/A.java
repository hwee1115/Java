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
	
	public void method() {	//메소드 안에 접근자 X	//이 메소드안에서만 사용
		class D {
			public int field;
			public D() {}
			public void method() {}
		}
		
		D d = new D();	//메소드가 끝나면 사용될 수 없음
		d.field =1;		//메소드가 끝나면 사용될 수 없음
		d.method();		//메소드가 끝나면 사용될 수 없음
	}
}

package ch09.exam03;
//컴파일  x,y를 b에 복사
public class A {
	public void method(final int x) {
		final int y= 2;	//자바8 이후 final생략 가능
		//x=10; //에러발생 	매개변수로 받은 값은 로컬 클래스에서 사용될 때 final
		//y=20; //로컬 변수도 final
		class B {
			public void method() {
				int result = x+y;
			}
		}
	}
}

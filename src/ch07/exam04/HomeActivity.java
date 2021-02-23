package ch07.exam04;

public class HomeActivity extends Activity {
	//field
	//constructor
	//method
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();	//부모의 코드 실행
		System.out.println("자식이 UI요소를 생성합니다.");
		System.out.println("자식이 UI 요스의 이벤트를 처리합니다.");
	}
}

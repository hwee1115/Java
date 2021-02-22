package ch06.exam10;

public class Example {

	public static void main(String[] args) {
		
		Changer changer = new Changer();
		//call by Value(값을 복사해서 호출)
		int value =1;
		changer.change(value);
		System.out.println(value);
		
		//Call by reference(번지를 복사해서 호출) 
		//string은 내부에 값을 바꿀 수 없음
		String v3 ="A";
		changer.change(v3);
		System.out.println(v3);
		
		//Call by reference(번지를 복사해서 호출)
		int[] arr1 = {0,0,0};
		changer.change(arr1);
		System.out.println(arr1[0]);
		
		String[] arr3 = {"A", "B", "C"};
		changer.change(arr3);
		System.out.println(arr3[0]);
		
		Member m1 = new Member();
		changer.change(m1);
		System.out.println(m1.age);

	}

}

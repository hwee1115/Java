package ch11.Exam07;

public class Example {

	public static void main(String[] args) {
		
		int var1 = 10;
		Integer var2 = new Integer(10);
		Integer var3 = 10;//10�� �����ִ� Integer��ü ���� Auto Boxing
		
		double var4 = 3.5;
		double var5 = new Double(3.5);
		double var6 =3.5; //Auto Boxing
		
		Integer var7 = new Integer(10);
		int var8 = var7.intValue();
		int var9 = var7;	//AUTO unBoxing	int var8 = var7.intValue();����
		
		Double var10 = new Double(3.5);
		double var11 = var10.doubleValue();
		double var12  = var10;
		
		//why?
		Object[] arr =new Object[5];
		arr[0] ="abc";
		arr[1] =10;	//AutoBoxing
		arr[2] = true;
	}

}

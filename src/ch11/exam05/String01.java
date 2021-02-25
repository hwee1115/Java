package ch11.exam05;

import java.util.Arrays;

public class String01 {
	//네트워크
	public static void main(String[] args) throws Exception {
		byte[] arr = {65,66,67};
		String str = new String(arr);
		System.out.println(str);
		
		
		String str2 = "ABC";
		byte[] arr2 = str2.getBytes();
		System.out.println(Arrays.toString(arr2));
		
		//try {
		String str3 = "가나다";
		byte[] arr31 = str3.getBytes("EUC-KR");
		byte[] arr32 = str3.getBytes("UTF-8");
		System.out.println(Arrays.toString(arr31));
		System.out.println(Arrays.toString(arr32));
		/*}catch(Exception e){
			e.printStackTrace();
		}*/
		
		String str4 = new String(arr31,"EUC-KR");
		String str5 = new String(arr32,"UTF-8");
		System.out.println(str4);
		System.out.println(str5);
	}

}

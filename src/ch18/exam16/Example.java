package ch18.exam16;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws Exception {
		
		//방법1
		/*
		InputStream is = System.in;
		byte [] data = new byte[100];
		int readNum = is.read(data);
		String str = new String(data,0,readNum-2);
		System.out.println(str);
		
		readNum = is.read(data);
		str = new String(data,0,readNum-2);
		System.out.println(str);*/
		
		//방법2
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);	//바이트->문자
		BufferedReader br = new BufferedReader(isr);	//사용하면 한줄입력전체를 읽게 할 수 있다.
		
		String str = br.readLine();
		System.out.println(str);
	}

}

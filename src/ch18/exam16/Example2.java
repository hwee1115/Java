package ch18.exam16;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Example2 {

	public static void main(String[] args) throws Exception {
		/*
		String filePath = "D:\\MyProject\\Java\\src\\ch18\\exam16\\data.txt";
		OutputStream os = new FileOutputStream(filePath);
		
		String data = "오늘은 수요일이다.";
		byte[] bytes = data.getBytes("UTF-8");	//바이트 배열얻기
		os.write(bytes);
		os.flush();
		
		data = "오늘은 추워요";
		bytes = data.getBytes("UTF-8");	//바이트 배열얻기
		os.write(bytes);
		os.flush();
		*/
		String filePath = "D:\\MyProject\\Java\\src\\ch18\\exam16\\data.txt";
		OutputStream os = new FileOutputStream(filePath);	//OutputStream을 꼭 써야하는 상황일 때
		Writer writer = new OutputStreamWriter(os,"UTF-8");
		
		String data = "오늘은 수요일이다.";
		writer.write(data);
		writer.flush();
		
		data="오늘은 추워요.";
		writer.write(data);
		writer.flush();
		
		writer.close();
	}

}

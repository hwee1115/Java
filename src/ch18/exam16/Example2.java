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
		
		String data = "������ �������̴�.";
		byte[] bytes = data.getBytes("UTF-8");	//����Ʈ �迭���
		os.write(bytes);
		os.flush();
		
		data = "������ �߿���";
		bytes = data.getBytes("UTF-8");	//����Ʈ �迭���
		os.write(bytes);
		os.flush();
		*/
		String filePath = "D:\\MyProject\\Java\\src\\ch18\\exam16\\data.txt";
		OutputStream os = new FileOutputStream(filePath);	//OutputStream�� �� ����ϴ� ��Ȳ�� ��
		Writer writer = new OutputStreamWriter(os,"UTF-8");
		
		String data = "������ �������̴�.";
		writer.write(data);
		writer.flush();
		
		data="������ �߿���.";
		writer.write(data);
		writer.flush();
		
		writer.close();
	}

}

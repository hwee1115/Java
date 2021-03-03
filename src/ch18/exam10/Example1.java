package ch18.exam10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Example1 {

	public static void main(String[] args) {
		String filePath1 ="D:\\MyProject\\Java\\src\\ch18\\exam10\\data.txt";
		String filePath2 ="D:\\MyProject\\Java\\src\\ch18\\exam10\\data2.txt";
		
		try {
			Reader reader = new FileReader(filePath1);
			Writer writer = new FileWriter(filePath2);
			
			char[] data = new char[1024];
			int readNum = -1;
			while((readNum=reader.read(data))!=-1) {
				writer.write(data,0,readNum);
			}
			reader.close();
			writer.flush();
			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

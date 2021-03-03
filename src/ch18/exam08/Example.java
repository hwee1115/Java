package ch18.exam08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		String filePath ="D:\\MyProject\\Java\\src\\ch18\\exam08\\data.txt";
		try {

			Reader reader = new FileReader(filePath);
			/*FileInputStream fis = new FileInputStream(filePath);	//운영체제의 기본 문자셋사용
			Reader reader = new InputStreamReader(fis,"UTF-8"); */
			/*방법2
			while(true) {
				int charCode=reader.read();
				if(charCode == -1) {
					break;
				}
				char charData =(char)charCode;
				System.out.println(charCode +": " + charData);
			}*/
			
			char[] data = new char[2];
			int readNum=-1;
			String str ="";
			while((readNum = reader.read(data))!=-1){
				str += new String(data,0,readNum);
			}
			System.out.println(str);
			
			reader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}

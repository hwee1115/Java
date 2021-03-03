package ch18.exam07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Example {

	public static void main(String[] args) {
		String filePath ="D:\\MyProject\\Java\\src\\ch18\\exam07\\data.txt";
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
			
			int charCode=-1;
			while((charCode = reader.read())!=-1){
				char charData =(char)charCode;
				System.out.println(charCode +": " + charData);
			}
			
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

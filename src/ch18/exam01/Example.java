package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {

		String filePath="D:\\Team1Projects\\Java\\src\\ch18\\exam01\\photo1.jpg";
		try {
			InputStream is = new FileInputStream(filePath);	//문자파일 FileRead사용이 더 효율적
			//방법 1
			/*while(true) {
				int data = is.read();
				if(data == -1) {
					break;
				}
				System.out.println(data);
		
			}*/
			
			//방법2
			int data = -1;
			while((data = is.read())!=-1) {
				System.out.print(data);
			}
			is.close(); //close하지않으면 다른프로그램이 연 파일을 사용하지 못함
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

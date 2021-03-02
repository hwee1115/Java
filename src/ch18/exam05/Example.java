package ch18.exam05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		String filePath="D:\\Team1Projects\\Java\\src\\ch18\\exam05\\data.txt";
		try {
			OutputStream os = new FileOutputStream(filePath);
			byte [] arr = {67,66,67};
			os.write(arr);
			os.write(arr);
			os.write(arr);
			os.flush();
			os.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

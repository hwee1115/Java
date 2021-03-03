package ch18.exam15;

import java.io.File;

public class Example {

	public static void main(String[] args) throws Exception {
		File file = new File("C:/Temp/data.txt");	
		if(!file.exists()) {
			file.createNewFile();
		}
		file = new File("C:/Temp/dir1");
		if(!file.exists()) {
			file.mkdir();
			//file.mkdirs(); -> 없는 경로를 다만듬
		}
		
		file = new File("C:/Temp/data.txt");
		if(file.exists()) {
			file.delete();
		}
		
		file = new File("C:/Temp/dir1/dir2/dir3"); //<-dir3삭제
		if(file.exists()) {
			file.delete();
		}
	}

}

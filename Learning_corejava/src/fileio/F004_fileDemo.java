package fileio;

import java.io.File;
import java.io.IOException;

public class F004_fileDemo {
	public static void main(String[] args) {
		
		
		File file = new File("C:\\Chintan_work\\Files\\test.txt");
		
		//System.out.println(file.exists());
		//file.mkdir();	
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
//		if(file.exists())
//		{
//			System.out.println("file available");
//			file.delete();
//			System.out.println("file deleted..");
//		}
//		else
//		{
//			try {
//				file.createNewFile();
//				System.out.println("file created...");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		file.setReadOnly();
		System.out.println(file.canWrite());
		
		
		
		
	}
}

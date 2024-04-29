package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F001_FileOutputStream {
	public static void main(String[] args) {
		
		FileOutputStream fos= null;
		try 
		{
			fos = new FileOutputStream("C:\\Chintan_work\\Files\\test.txt");
			String str = "This is my first io program";
			byte b[] = str.getBytes();
			fos.write(b);
			System.out.println("Data written..");
			
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
		}
		
	}
}

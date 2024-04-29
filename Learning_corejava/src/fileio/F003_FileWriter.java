package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class F003_FileWriter {
	public static void main(String[] args) {
		
		
		FileWriter fw = null;
		try 
		{
			fw  =new  FileWriter("C:\\Chintan_work\\Files\\home.txt");
			fw.write("Hello java, hello tops");
			fw.flush();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

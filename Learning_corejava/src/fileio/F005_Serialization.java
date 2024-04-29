package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class F005_Serialization {
		public static void main(String[] args) {
			
			
			
			Student st = new Student();
			
			try {
				FileOutputStream fos = new FileOutputStream("C:\\Chintan_work\\Files\\data.ser");
				ObjectOutputStream objs = new ObjectOutputStream(fos);
				objs.writeObject(st);
			
				System.out.println("Object written....");
			
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}

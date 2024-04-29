package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class F006_Deserialized {
	public static void main(String[] args) {
		
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Chintan_work\\Files\\data.ser");
			ObjectInputStream objs = new ObjectInputStream(fis);
			Student st = (Student) objs.readObject();
			st.display();
		
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

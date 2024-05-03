package collection;

import java.util.Enumeration;
import java.util.Vector;

public class C006_Vector {
	public static void main(String[] args) {
		
		
		
		Vector<Integer> vc = new Vector<Integer>();
		vc.addElement(10);
		vc.addElement(20);
		vc.addElement(30);
		
		
		Enumeration<Integer> e = vc.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
	}
}

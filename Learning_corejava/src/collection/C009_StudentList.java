package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class C009_StudentList {
	
	public static void main(String[] args) {
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(10, "tops", "abc@gmial.com"));
		al.add(new Student(20, "tech", "tech@gmial.com"));
		al.add(new Student(15, "xyz", "tops@gmial.com"));
		al.add(new Student(12, "abc", "xyz@gmial.com"));
		
		
		//Collections.sort(al,new SortById());
		Collections.sort(al,new SortByName());
		
		
		
		Iterator<Student> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		
		}
		
	}
}

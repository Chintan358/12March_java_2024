package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class C008_UserList {
	
	public static void main(String[] args) {
		
		
		ArrayList<User> al = new ArrayList<User>();
		al.add(new User(10, "tops", "abc@gmial.com"));
		al.add(new User(20, "tech", "tech@gmial.com"));
		al.add(new User(15, "xyz", "tops@gmial.com"));
		al.add(new User(12, "abc", "xyz@gmial.com"));
		
		
		Collections.sort(al);
		
		Iterator<User> itr = al.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			User u = itr.next();
			u.display();
		}
		
	}
}

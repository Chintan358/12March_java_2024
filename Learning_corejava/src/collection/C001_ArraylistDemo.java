package collection;

import java.util.ArrayList;

public class C001_ArraylistDemo {
	public static void main(String[] args) {
		
		
		//default size : 10
		//new size  = oldsize * 3/2 + 1  = 16
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("php");
		al.add("android");
		al.add("sql");
		al.add("sql");
		al.add(null);
		al.add(" ");
		
		//al.add(2,"Oracle");
		//al.set(2, "Python");
		//al.remove(2);
		//System.out.println(al.get(2));
		//System.out.println(al.size());
		
		
		for(String s : al)
		{
			System.out.println(s);
		}
		
		System.out.println("**************************");
		
		ArrayList al1 = new ArrayList();
		al1.add("Java");
		al1.add(10);
		al1.add(10.23);
		al1.add('A');
		
		
		for(Object o  :al1)
		{
			System.out.println(o);
		}
		
		
	}
}

package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class C005_TreeSet {
	public static void main(String[] args) {
		
		
		TreeSet set = new TreeSet();
		set.add("java");
		set.add("sql");
		set.add("android");
		set.add("php");
		set.add("java");
		set.add("10");
		
		//Iterator<String> itr = set.iterator();
		Iterator<String> itr = set.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}
}

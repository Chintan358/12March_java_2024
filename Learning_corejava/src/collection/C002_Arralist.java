package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class C002_Arralist {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		
		
		ArrayList<Integer> al1 = new ArrayList<Integer>(al);
		al1.add(100);
		al1.add(200);
		al1.add(300);
		al1.addAll(al);
		
//		
//		Iterator<Integer> itr = al1.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
		
		ListIterator<Integer> itr = al1.listIterator();
		
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		System.out.println("*************");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
	}
}

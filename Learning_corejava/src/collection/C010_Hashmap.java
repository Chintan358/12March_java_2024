package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C010_Hashmap {
	public static void main(String[] args) {
		
		
		
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("IN", "India");
		map.put("US", "usa");
		map.put("CAN", "canada");
		map.put("IN" ,"Iran");
		
		//System.out.println(map);
		
//		Set s = map.entrySet();
		
//		Iterator itr = s.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		
		for(Entry<String, String> m : map.entrySet())
		{
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		
		
	}
}

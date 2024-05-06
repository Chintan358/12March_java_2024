package basicpractical;

import java.util.HashMap;

public class WordCount {
	public static void main(String[] args) {
		
		
		String str = "Hello java java Hello tops Hello";
		
		String words[] = str.split(" ");
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		
		for(int i=0;i<words.length;i++)
		{
			if(!words[i].equals("tops"))
			{
			if(map.get(words[i])==null)
			{
				map.put(words[i], 1);
			}
			else
			{
				int k = map.get(words[i]);
				k++;
				map.put(words[i], k);
			}
			}
		}
		
		System.out.println(map);
		
		
	}
}

package impclasses;

public class S002_StringMethods {
	public static void main(String[] args) {
		
		
		String str = "Sun Rises in east";
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf('i'));
		System.out.println(str.lastIndexOf('i'));
		System.out.println(str.startsWith("S"));
		System.out.println(str.endsWith("k"));
		System.out.println(str.replace('i', 'x'));
		System.out.println(str.substring(5,9));
		System.out.println(str.trim());
		
		System.out.println("*************************");
		
		String words[] =   str.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		System.out.println("*********************");
		
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("***************************");
		
		byte b[] = str.getBytes();
		
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		
		
		
		
		
	}
}

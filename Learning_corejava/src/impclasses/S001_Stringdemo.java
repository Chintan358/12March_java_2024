package impclasses;

public class S001_Stringdemo {
	public static void main(String[] args) {
		
//		//string litral
//		String str = "Hello";
//		//String object
//		String s = new String("Hello");
//		
//		String str1 =  str.concat("Java");
//		
//		System.out.println(str1);
//		System.out.println(s);
//		
		String str = new String("Java");
		String str1 = new String("Android");
		String str2 = new String("Java");
		
		
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println(str == str2);
		
		
		System.out.println("********************");
		
		String s = "Java";
		String s1 = "Android";
		String s2 = "Java";
		

		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s == s2);
		
	}
}

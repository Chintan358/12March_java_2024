package impclasses;

public class S005_Wrapper {
	public static void main(String[] args) {
		
		
		int i = 10;
		
		//boxing
		Integer i1 = new Integer(i);
		//autoboxing
		Integer i2 = i;
		
		
		Integer k = 565;
		//unboxing
		int k1 = k.intValue();
		//auo unboxing
		int k2 = k;
		
		
		int x = 12656;
		Integer y = x;
		int l = y.toString().length();
		System.out.println(l);
		
	}
}

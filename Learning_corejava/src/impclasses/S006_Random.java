package impclasses;

import java.util.Random;

public class S006_Random {
	public static void main(String[] args) {
		
		
		Random rd  =new Random();
		int i = rd.nextInt(1000, 9999);
		System.out.println(i);
		
	}
}

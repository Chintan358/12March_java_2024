package basicpractical;

public class PT5 {
	public static void main(String[] args) {
		
		
		
//		    *
//		   * *
//		  * * *
//		 * * * *
//		* * * * *
		
		int lines = 5;
		int starCount = 1;
		int spcaeCount = lines-1;
		for (int i = 1; i <=lines; i++) {
			
			for(int k=0;k<=spcaeCount;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=starCount;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			starCount++;
			spcaeCount--;
			
		}
		
		
		
		
	}
}

package basicpractical;

public class P002_Primenumber {
	public static void main(String[] args) {
		
		for(int j=3;j<=100;j++)
		{
			int num = j;
			int flag = 0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag = 1;
					break;
				}
			
			}
			
			if(flag==1)
			{
				//System.out.println(num +" : not prime");
			}
			else
			{
				System.out.println(num +" : prime");
			}
			
		
		}
	}
}

package basicpractical;

public class P003_Armstrong {
	public static void main(String[] args) {
		
		for(int i=0; i<=10000;i++)
		{
		
		Integer num = i;
		Integer temp  = num;
		double sum = 0;
		while(num !=0 )
		{
			int rem = num%10;
			//sum  =sum + (rem*rem*rem*rem);
			sum = sum + Math.pow(rem, temp.toString().length());
			num = num/10;
		}
		
		if(temp == sum)
		{
			System.out.println(temp+" : armstrong");
		}
		else
		{
			//System.out.println("Not armstrong");
		}
		}
		
		
	}
}

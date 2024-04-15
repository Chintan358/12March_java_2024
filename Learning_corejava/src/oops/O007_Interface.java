package oops;


interface Inter
{
	public static final int a = 10;
	public void sample();
}

interface Inter1 extends Inter
{
	public void run();
	public void sample();
	
}

class InterDemo
{
	
}

class InterImpl extends InterDemo implements Inter,Inter1
{

	@Override
	public void sample() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class O007_Interface {
	public static void main(String[] args) {
		
		
		
		
	}
}

package exception;

import java.io.FileNotFoundException;
import java.io.IOException;


public class ExceptionWithInheritance {
	
	public void display() throws Exception
	{
		
	}
}

class Sample extends ExceptionWithInheritance
{
	@Override
	public void display() throws IOException
	{
		
	}
}
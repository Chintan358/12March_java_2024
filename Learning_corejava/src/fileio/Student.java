package fileio;

import java.io.Serializable;

public class Student implements Serializable
{
	int id = 20;
	String name = "Rishabh";
	transient String email = "rishabh@gmial.com";
	
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email);
	}
}

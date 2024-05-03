package collection;

public class Student  {
	int id;
	String name;
	String email;
	
	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email);
	}

	
		
	
}

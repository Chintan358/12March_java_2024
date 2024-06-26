package collection;

public class User implements Comparable<User> {
	int id;
	String name;
	String email;
	
	public User(int id, String name, String email) {
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

	@Override
	public int compareTo(User o) {
		int i = 0;
		//10 12
		if(o.id < this.id)
		{
			i = -1;
		}
		else if(o.id>this.id)
		{
			i = 1;
		}
		else
		{
			i = 0;
		}
		
		
		return i;
		
		
		
		
		
	}
}

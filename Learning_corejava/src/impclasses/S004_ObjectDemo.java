package impclasses;

class Obj_Demo
{
	int id = 20;
	String name="test";
	
	@Override
	public String toString() {
		return "Obj_Demo [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class S004_ObjectDemo {
	public static void main(String[] args) {
		
		Obj_Demo d = new Obj_Demo();
		//System.out.println(d.getClass());
		
		System.out.println(d);
		
	}
}

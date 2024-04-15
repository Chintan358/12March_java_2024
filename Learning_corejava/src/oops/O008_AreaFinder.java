package oops;

interface shape
{
	double PI = 3.14;
	public void findArea();
}

class Square implements shape
{
	double length;
	
	public Square(double length) {
		super();
		this.length = length;
	}

	@Override
	public void findArea() {
		double area = length*length;
		System.out.println("Area of square is : "+area);
	}
	
}

class Triangle implements shape
{
	double height;
	double base;
	
	
	public Triangle(double height, double base) {
		
		this.height = height;
		this.base = base;
	}


	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		double area= 0.5*base*height;
		System.out.println("area of triangle is : "+area);
	}
	
}

class Circle implements shape
{

	double r;
	
	
	public Circle(double r) {
	
		this.r = r;
	}


	@Override
	public void findArea() {
		
		double area = PI*r*r;
		System.out.println("Area of circle is : "+area);
		
	}
	
}

public class O008_AreaFinder {
	public static void main(String[] args) {
		
		
		shape s1 = new Square(100);
		shape s2 = new Triangle(100, 200);
		shape s3 = new Circle(20);
		
		s1.findArea();
		s2.findArea();
		s3.findArea();					
	}
}

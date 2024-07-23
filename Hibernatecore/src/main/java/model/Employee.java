package model;





import jakarta.persistence.*;


@Entity
@Table(name="emp")
public class Employee {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name",length = 50)
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="salary")
	private double salary;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}

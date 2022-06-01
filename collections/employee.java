package collections;

public class employee {

	private String name;
	private int id;
	private double salary;
	private String dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		}
	public int getId(int id) { 
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public double getSalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public employee(String name, int id, long salary, String dept) {
		super();
		this.name=name;
		this.id=id;
		this.dept=dept;
		this.salary=salary;
	}
	public String toString() {
		return "Employee[name:" + name + ",department:" + dept +"]";
	}
}

package generics;

public class genericsEmployee {
int id;
String name;
int salary;
String dept;
public genericsEmployee(int id, String name, int salary, String dept)
{
	this.id=id;
	this.name= name;
	this.salary=salary;
	this.dept=dept;
}
public String toString() {
	return "id:" + id +" "+"name:"+ name +" "+"salary:" + salary +" "+ "dept:" + dept;
}
}


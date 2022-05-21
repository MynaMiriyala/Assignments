package javaAssignments2;

public class Employee {
		String Designition;
		String name;
		int id;
		long salary;
		public Employee(String Designition,String name,int id,long salary) {
			this.Designition=Designition;
			this.name=name;
			this.id=id;
			this.salary=salary;
		}
	}
	class Manager extends Employee {
		int incentive;
		public Manager(String Designition, String name, int id, long salary,int incentive) {
			super(Designition, name, id, salary);
			this.incentive=incentive;
		}
		public void manager_data() {
			System.out.println("Employee Designition:"+ Designition);
			System.out.println("Employee name:" + name);
			System.out.println("Employee id:" + id);
			System.out.println("salary:" + salary);
			System.out.println("insentives:" + incentive);
		}
		void totalSalary() {
			long total;
			total=salary+incentive;
			System.out.println("total salary=" + total);
		}
		
	}
	class Labour extends Employee {
		int overTime;
		public Labour(String Designition, String name,int id, long salary,int overTime) {
			super(Designition, name, id, salary);
			this.overTime=overTime;
		}
		public void Labour_data() {
			System.out.println("Employee Designition:"+ Designition);
			System.out.println("Employee name:" + name);
			System.out.println("Employee id:" + id);
			System.out.println("salary:" + salary);
			System.out.println("overTime:" + overTime);
			
		}
		void totalSalary() {
			long total;
			total=salary+overTime;
			System.out.println("total salary=" + total);
		}
	}
		


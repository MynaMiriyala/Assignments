package generics;

import java.util.HashSet;
import java.util.Set;

public class generics1 {
public static void main(String[] args) {
	genericsEmployee emp = new genericsEmployee(1,"myna",20000,"CSE");
	genericsEmployee emp1 = new genericsEmployee(2,"raji",30000,"CALT");
	genericsEmployee emp2 = new genericsEmployee(3,"honey",10000,"ECE");
	genericsEmployee emp3 = new genericsEmployee(4,"sweety",40000,"BPC");
	
	Set<genericsEmployee> sEmp = new HashSet<>();
	sEmp.add(emp);
	sEmp.add(emp1);
	sEmp.add(emp2);
	sEmp.add(emp3);
	for (genericsEmployee e: sEmp) {
		System.out.println(e);
	}
}
}

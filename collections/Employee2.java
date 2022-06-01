package collections;

import java.util.Scanner;
import java.util.*;
import java.util.TreeSet;

public class Employee2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("choose your sorting category");
	System.out.println("1.name 2.id 3.salary 4.department");
	int choose =sc.nextInt();
	Set<employee> s =null;
	if(choose==1) {
		s= new TreeSet<>(new nameComp());
	}
	else if(choose==2) {
		s = new TreeSet<>(new idComp()); 
	}
	else if(choose==3) {
		s = new TreeSet<>(new salaryComp()); 
	}
	else if(choose==4) {
		s = new TreeSet<>(new deptComp()); 
	}
	s.add(new employee ("myna",52,20000,"developer"));
	s.add(new employee ("kavitha",53,25000,"web developer"));
	s.add(new employee ("priya",36,30000,"cloud"));
	s.add(new employee ("ramya",91,26000,"python developer"));
	s.add(new employee ("jyothsna",04,30000,"tester"));
	s.add(new employee ("siddu",06,22000,"java developer"));
	s.add(new employee ("maneesha",57,28000,"web developer"));
	s.add(new employee ("jyothi",45,27000,"cloud"));
	for(employee temp:s) {
		System.out.println(temp);
	}
}
}
class idComp implements Comparator<employee> {
	public int Compare(employee o1,employee o2) {
		if(o1.getId(0) > o2.getId(0)) {
			return 1;
		}
		else { 
			return -1;
		}
	}

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
class nameComp implements Comparator<employee> {
	public int Compare(employee o1,employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
class deptComp implements Comparator<employee> {
	public int Compare(employee o1,employee o2) {
		return o1.getDept().compareTo(o2.getDept());
	}

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
class salaryComp implements Comparator<employee> {
	public int Compare(employee o1,employee o2) {
		if(o1.getSalary() > o2.getSalary()) {
			return 1;
		}
		else { 
			return -1;
		}
	}

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

	
	
	
	
	
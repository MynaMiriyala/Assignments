package javaAssignments2;

public class polymorphism {
public static void main(String[] args) {
	savings svg=new savings(1,20000);
	svg.amount();
	current cur = new current(2,2000);
	cur.amount();
	cur.total(20000, 2000);
}
}

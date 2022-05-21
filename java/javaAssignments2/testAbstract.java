package javaAssignments2;

abstract class testAbstract {
	abstract void fun();
}
class derived extends testAbstract {
	void fun() {
		System.out.println("derived function called");
	}
}

package javaAssignments2;

abstract class Shape {
String name;
public Shape(String name) {
	this.name=name;
}
public abstract void draw();
}
class Line extends Shape {
	public Line(String name) {
		super(name);
		
	}

	public void draw() {
		System.out.println("draw a line");
	}
}
class Circle extends Shape {
	public Circle(String name) {
		super(name);
		
	}

	public void draw() {
		System.out.println("draw a circle");
	}
}
class Rectangle extends Shape {
public Rectangle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

public void draw() {
	System.out.println("draw a Rectangle");
}
}
class Cube extends Shape {
public Cube(String name) {
		super(name);
		
	}

public void draw() {
	System.out.println("draw a cube");
}
}
class Cone extends Shape {
public Cone(String name) {
		super(name);
		
	}

public void draw() {
	System.out.println("draw a Cone");
}
}
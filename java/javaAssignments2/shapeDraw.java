package javaAssignments2;

public class shapeDraw {
public static void main(String[] args) {
	Line ln=new Line("Line");
	ln.draw();
	Circle cl=new Circle("Circle");
	cl.draw();
	Rectangle rc=new Rectangle("Rectangle");
	rc.draw();
	Cone cn=new Cone("Cone");
	cn.draw();
	Cube cb=new Cube("Cube");
	cb.draw();
}
}
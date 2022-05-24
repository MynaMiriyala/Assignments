package exceptionHandling;

import java.util.Scanner;

public class exceptionHandling1 {
public static void main(String[] args) {
	try
	{
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number:");
	a= sc.nextInt();
	System.out.println("Enter second number:");
	b= sc.nextInt();
	c=a/b;
	System.out.println("c value=" + c);
}
	catch(ArithmeticException e) {
		System.out.println("unsupported operation exception");
	}
}
}

package javaAssignments;

import java.util.Scanner;

public class studentResult {
	private static Scanner sc;

	public static void main(String[] args) {
		int a,b,c;
		sc = new Scanner(System.in);
		System.out.println("Enter marks of first Subject:");
		a=sc.nextInt();
		System.out.println("Enter marks of second Subject:");
		b=sc.nextInt();
		System.out.println("Enter marks of third subject:");
		c=sc.nextInt();
		
		if(a>60 && b>60 && c>60) {
			System.out.println("Pass");
			}
		
			else if((a+b)>60 || (b+c)>60 || (a+c)>60) 
			{
				System.out.println("Promoted");
			}
			else if(a<60 || b<60 || c<60) {
				System.out.println("Fail");
			}
			else {
				System.out.println("fail");
			}
				
	}

}

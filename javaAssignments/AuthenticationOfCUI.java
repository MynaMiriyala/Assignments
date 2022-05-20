package javaAssignments;

import java.util.Scanner;

public class AuthenticationOfCUI {
public static void main(String[] args) {
	String UserName="Myna";
	String Password="Myna552";
	int count=0;
	String A,B;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter UserName:");
	A=sc.nextLine();
	System.out.println("Enter Password:");
	B=sc.nextLine();

	if(A.contains(UserName) && B.contains(Password))	{
		System.out.println(A + "Welcome..");
	}
	else {	
		count++;
		main(null);
		if (count==3)
		{
			System.out.println("Contact Admin");
		}
}
}
}

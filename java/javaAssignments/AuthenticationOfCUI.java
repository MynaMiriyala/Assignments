package javaAssignments;

import java.util.Scanner;

public class AuthenticationOfCUI {

	private static Scanner sc;

	public static void main(String[] args) {
	
		String UserName="Myna";
	    String Password="Myna552";
	    int count=0;
	    String A,B;
	
	    sc = new Scanner(System.in);
		System.out.println("Enter UserName:");
		A=sc.nextLine();
		System.out.println("Enter Password:");
		B=sc.nextLine();
	
	    if(A.equals(UserName) && B.equals(Password)){
		System.out.println(A + "Welcome..");
	}
	
	    else {	
	    	System.out.println("Incorect UserName or Password");
		    count+=1;
		
	if (count==3)
		{
			System.out.println("Contact Admin");
		}
	main(null);
        }
}
}

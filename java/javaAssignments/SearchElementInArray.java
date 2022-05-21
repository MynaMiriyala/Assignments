package javaAssignments;

import java.util.Scanner;

public class SearchElementInArray {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		int[] a={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int x,flag=0, i=0, n=15;
		sc = new Scanner(System.in);
		System.out.println("Enter the number you want to search:");
		x=sc.nextInt();
		
		for (i=0; i<n; i++)
		{
			if(a[i] == x)
			{
				flag=1;
				break;
			}
			
			else
			{
				flag=0;
			}
		}
		
		if(flag == 1)
		{
			System.out.println("Element Found");
		}
		
		else
		{
			System.out.println("Element not Found");
		}
		
	}

}

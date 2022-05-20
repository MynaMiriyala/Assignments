package javaAssignments;

import java.util.Scanner;

public class SimpleAndCompoundInterest {
	public static void main(String[] args) 
		{
			double principal, rate, time, sim, com;
			Scanner sc= new Scanner (System.in);
			
			System.out.println("Enter the amount");
			principal = sc.nextDouble();
			
			System.out.println("Enter the No.of Years:");
			time=sc.nextDouble();
			
			System.out.println("Enter the Rate of interest");
			rate=sc.nextDouble();
	
			sim=(principal * time *rate) / 100;
			com= principal * Math.pow(1.0+rate/100.0,time)- principal;
			System.out.println("Simple Interest="+sim);
			System.out.println("Compound Interest=" + com);
			
			
		}
}

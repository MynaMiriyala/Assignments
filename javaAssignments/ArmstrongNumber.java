package javaAssignments;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int n = 153;
		int x = n;
		int temp = n;
		int p = 0;
		
		while (n > 0) {
			int rem = n % 10;
			p = (p) + (rem * rem * rem);
			n = n / 10;
		}
		
		if(temp == p) {
			System.out.println(x + "is Armstrong number");
		}
		else {
			System.out.println(x + "is not an Armstrong Number");
		}
		
	}

}

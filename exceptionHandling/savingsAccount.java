package exceptionHandling;

import java.util.Scanner;

public class savingsAccount {
	public static void main(String[] args) throws illegalBankTransactionException {
long id;
double balance=20000;
double withdraw;
double deposit;
Scanner sc = new Scanner(System.in);
System.out.println("Enter id:");
id=sc.nextLong();
System.out.println("Enter withdraw amount:");
withdraw=sc.nextDouble();
try {
	if(balance<withdraw) {
		throw new insufficientBalanceException("insufficient funds ! your current balance is:" + balance);
	}
	else if(withdraw<1) {
		throw new illegalBankTransactionException("Enter positive amount");
		
	}
	
	else {
		System.out.println("please take your money:" + withdraw);
	}
}
catch (insufficientBalanceException ibe ) {
	ibe.printStackTrace();
}
catch (illegalBankTransactionException ite) {
	ite.printStackTrace();
}
}
}
package javaAssignments2;

import java.util.Scanner;

public class BankAccount {
	int account_type;
	private Scanner sc;
	public BankAccount(int account_type) {
		sc = new Scanner(System.in);
		System.out.println("Enter Accoun type 1.Savings,2.current:");
		account_type=sc.nextInt();
	}

}

class savings extends BankAccount {
	int fixedDeposits;
	public savings(int account_type,int fixedDeposits) {
		super(account_type);
		this.fixedDeposits=fixedDeposits;
	}
	public void amount() {
		System.out.println("fixedAmount=" + fixedDeposits);
	}
}
class current extends BankAccount {
	int cashCredit;
	public current(int account_type,int cashCredit) {
		super(account_type);
		this.cashCredit=cashCredit;
	}
	public void amount() {
		System.out.println("cashCredit=" + cashCredit);
	}
	void total(int fixedDeposits,int cashCredit) {
		int total=fixedDeposits+cashCredit;
		System.out.println("total amount in bank is:" + total);
	}
}
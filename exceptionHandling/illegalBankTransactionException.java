package exceptionHandling;

public class illegalBankTransactionException extends Exception {
	String message2;
	public illegalBankTransactionException(String message2) {
		this.message2=message2;
	}
	public String toString() {
		return message2;
		
	}
}

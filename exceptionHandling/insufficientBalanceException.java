package exceptionHandling;

public class insufficientBalanceException extends Exception {
String message;
public insufficientBalanceException(String message) {
	this.message=message;
}
public String toString() {
	return message;
	
}
}


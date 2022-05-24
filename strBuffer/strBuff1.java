package strBuffer;

public class strBuff1 {
public static void main(String[] args) {
	StringBuffer sb1 = new StringBuffer(" StringBuffer");
	System.out.println("first string:" + sb1);
	sb1.append(" is a peer class of string");
	System.out.println("after adding 2nd string:" + sb1);
	sb1.append(" that provides much of");
	sb1.append(" the functionality of strings");
	System.out.println(sb1);
}
}

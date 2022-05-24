package strBuilder;

public class strBuild1 {
public static void main(String[] args) {
	StringBuilder sbu1 = new StringBuilder(" StringBuilder");
	System.out.println("first string:" + sbu1);
	sbu1.append(" is a peer class of string");
	System.out.println("after adding 2nd string:" + sbu1);
	sbu1.append(" that provides much of");
	sbu1.append(" the functionality of strings");
	System.out.println(sbu1);
}
}

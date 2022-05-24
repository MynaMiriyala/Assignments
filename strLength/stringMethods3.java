package strLength;

public class stringMethods3 {
public static void main(String[] args) {
	String S =" Java string pool refers to collection of strings which are stored in heap memory";
	String S2=" java string pool refers to collection of strings which are stored in heap memory";
	System.out.println("in lower case:" + S.toLowerCase());
	System.out.println("in Upper case:" + S.toUpperCase());
	System.out.println("'a' replace with '$':" + S.replace("a","$"));
	System.out.println("contains collection or not:" + S.contains("collection"));
	System.out.println("matchin or not:" + S.equals(S2));
	System.out.println("matchin or not:" + S.contains(S2));
	System.out.println("matchin or not:" + S.equalsIgnoreCase(S2));
}
}

package javaAssignments2;

public class Singleton {
	private static Singleton single_instance = null;
	  
    public String s;
  
    private Singleton()
    {
        s = "Hii I am a string part of Singleton class";
    }
  
    public static Singleton Singleton()
    {
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }	  

 class singleton {
   
    public static void main(String args[])
    {
        
        Singleton x = Singleton.Singleton();
  
        
        Singleton y = Singleton.Singleton();
  
        
        Singleton z = Singleton.Singleton();
  
       
        x.s = (x.s).toUpperCase();
  
       
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
  
        
        z.s = (z.s).toLowerCase();
  
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
 }
}

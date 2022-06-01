package collections;

import java.util.HashSet;

public class Products {
		
		public static void main(String[] args) {
					HashSet<uniqueProducts> hs = new HashSet<uniqueProducts> ();
					uniqueProducts p1= new uniqueProducts(1,"book");
					uniqueProducts p2= new uniqueProducts(2,"laptop");
					uniqueProducts p3= new uniqueProducts(3,"pen");
					uniqueProducts p4= new uniqueProducts(4,"bike");
					uniqueProducts p5= new uniqueProducts(5,"mobile");
					hs.add(p1);
					hs.add(p2);
					hs.add(p3);
					hs.add(p4);
					hs.add(p5);
					for(uniqueProducts p:hs) {
						System.out.println(p.pid+" "+p.pname);
					}
		}
}

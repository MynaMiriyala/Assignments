package collections;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import collections.Contact.Gender;

public class treemap {

public static void main(String[] args) {
	Long a=Long.valueOf("8331820629");
    Long b=Long.valueOf("9491805089");
    Long c=Long.valueOf("8008849541");
    Long d=Long.valueOf("6300217232");
	Contact a1=new Contact(a,"Myna","myna@gmail.com", Gender.FEMALE);
    Contact a2=new Contact(b,"Raji","raji@gmail.com", Gender.FEMALE);
    Contact a3=new Contact(c,"Jeevan","jeevan@gmail.com", Gender.MALE);
    Contact a4=new Contact(d,"Nicky","nicky@gmail.com", Gender.MALE);
    TreeMap<Long,Contact> info= new TreeMap<Long,Contact>(Collections.reverseOrder());
    info.put(a,a1);
    info.put(b,a2);
    info.put(c,a3);
    info.put(d,a4);
    System.out.println("All the key-Value pairs: ");
    //printing all key-value pairs
    for (Map.Entry<Long, Contact> entry: info.entrySet()){
        System.out.println(entry.getKey()+" = "+entry.getValue());
    }
    //Printing all the keys
    System.out.println("All the Keys: ");
    for (Map.Entry<Long, Contact> entry: info.entrySet()){
        System.out.println(entry.getKey());
    }
    System.out.println("All the Values: ");
    //printing all values
    for (Map.Entry<Long, Contact> entry: info.entrySet()){
        System.out.println(entry.getValue());
}
}
}
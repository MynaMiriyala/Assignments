package collections;

public class Contact {
private long phoneNumber;
private String name;
private String Email;
private Gender gender;
enum Gender{
	MALE,FEMALE;
}
	
public Contact(long phoneNumber, String name, String Email,Gender gender) {
this.phoneNumber=phoneNumber;
this.name=name;
this.Email=Email;
this.gender=gender;
}
public String toString() {
   
    return "name: "+name+" "+" Phone no: "+phoneNumber+" "+" email: "+Email +" "+"gender:" +gender;
}
}

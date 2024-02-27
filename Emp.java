public class Emp
{
int id;
int age;
String name;
Address address;

public Emp(int id,int age,String name,Address address)
{
this.id = id;
this.name = name;
this.age = age;
this.address = address;
}

void display()
{
System.out.println(id + " " + name);
System.out.println(address.city + " " + address.state + " " + address.country);
}
public static void main(String []args)
{
Address a1 = new Address("Kanpur" , "UP" , "India");
Address a2 = new Address("Jabalpur" , "MP" , "India");

Emp e1 = new Emp(100 , 22 ,"Yedneshwar", a1);
Emp e2 = new Emp(101 , 20 ,"Ramesh" , a2);

e1.display();
e2.display();
}
}

class Address
{
String city,state ,country;

public Address(String city,String state,String country)
{
this.city = city;
this.state = state;
this.country = country;
}
}

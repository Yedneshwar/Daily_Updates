import java.io.*;
class Student 
{
    int rollNo;
    String name;
    static String clg;
    Student(int r, String n)
    {
        rollNo = r;
        name = n;
    }
    void  display()
    {
        System.out.println(rollNo +" "+name+" "+clg);
    }
}
public class TestStaticVariable
{
    public static void main(String [] args)
    {
        Student s1 = new Student(100, "Karan");
        Student s2 = new Student(101, "Ram");
        s1.display();
        s2.display();
    }

}
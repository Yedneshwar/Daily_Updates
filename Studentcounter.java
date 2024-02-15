
class Student
{
    int rn;
    String name;
    static int sn = 0;
    Student(int r , String n)
    {
        rn = r;
        name = n;
        sn++;        
    }
    void display()
    {
        System.out.println(rn+" "+name+" "+sn);
    }
    public static void main(String[] args)
    {
        Student s1 = new Student(1,"Atul");
        Student s2 = new Student(2, "Abhay");
        s1.display();
        s2.display();
    }
}
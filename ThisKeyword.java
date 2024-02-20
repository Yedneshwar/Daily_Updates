class Test
{
    public static void main(String []args)
    {
        Student s1 = new Student(10,"Ram","B.Tech");
        Student s2 = new Student(11,"Lakshman","M.Tech",180000);
        s1.display();
        s2.display();
        s2.getClass();
    }
}
class Student 
{
    int rollno;
    String name,course;
    float fee;
    Student(int rollno,String name,String course)
    {
        rollno = rollno;
        this.name = name;
        this.course = course;

    }
    Student(int rollno,String name,String course,float fee)
    {
        this(rollno,name,course);
        this.fee = fee;
    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+course+" "+fee);
    }
}
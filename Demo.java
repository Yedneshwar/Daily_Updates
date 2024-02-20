class Demo
{
int iv;
String in;
Demo(int a,String b)
{
iv = a;
in = b;
display();
}
void display()
{
System.out.println(iv+" "+in);
}
public static void main(String[] args)
{
Demo d1 = new Demo(100,"Subhash");
d1.display();
}
}
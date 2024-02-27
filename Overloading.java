public class Overloading
{
public static void main(String []args)
{
System.out.println(MethodOverloading.addTwoNumbers(10,20));
System.out.println(MethodOverloading.addThreeNumbers(10,20,30));
}
}

class MethodOverloading
{
static int addTwoNumbers(int a ,int b )
{
return a + b ;
}
static int addThreeNumbers(int a,int b,int c)
{
return a + b + c;
}
}


class Inherit extends Employee
{
int bonus = 10000;
public static void main(String[] args)
{
Inherit c1 = new Inherit();
System.out.println("Programmer salary and bonus are:" + (float)c1.sal+" and "+(int)c1.bonus+"respectively");
}}
class Employee
{
float sal = 40000;
}

import java.io.FileNotFoundException;
imtport java.io.PrintWriter;
public class TryCatch1
{ public static void main(String []args)
{
PrintWriter pw;
try 
{
pw = new PrintWriter("RAM.txt");//may throw an exception
pw.println("Saved");
}
catch(FileNotFoundException e)
{
System.out.println(e);
}System.out.println("File Saved Successfully");
}
}
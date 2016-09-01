import java.io.*;
class reverse
{
public static void main(String args[])
{
System.out.println("Enter the string");
Scanner s=new Scanner(System.in);
String a=s.nextLine();
StringBuffer str=new StringBuffer(a);
System.out.println(a.reverse());
}
}

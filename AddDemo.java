import java.io.*;
class AddDemo
{
public static void main(String args[])throws IOException
 {
DataInputStream ds=new DataInputStream(System.in);
System.out.print("Enter 1st number :");
int a=Integer.parseInt(ds.readLine());
System.out.print("Enter 2nd number :");
int b=Integer.parseInt(ds.readLine());
int c=a+b;
System.out.println("the Addition is :"+c);
 }
}
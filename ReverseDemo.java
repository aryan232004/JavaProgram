import java.io.*;
class ReverseDemo
{
public static void main(String args[])throws IOException
 {
DataInputStream ds= new DataInputStream(System.in);
int n,rem,rev,q;
System.out.print("Enter a number :-");
n=Integer.parseInt(ds.readLine());
rem=n%10;
q=n/10;
rev=rem*10+q;
System.out.println("the reverse number is :"+rev);
 }
}
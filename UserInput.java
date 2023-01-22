import java.io.*;
class UserInput
{
public static void main(String args[])throws IOException
 { 
DataInputStream ds= new DataInputStream(System.in);
String name;
System.out.print("Enter your name :");
name=ds.readLine();
System.out.println("\nWelcome "+name); 
 }
}
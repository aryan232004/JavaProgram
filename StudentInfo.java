import java.io.*;
class Student
{
int r;
String name;
void getData(int x,String y)
 {r=x;name=y;}
void show() 
{
System.out.println("Roll number :" +r);
System.out.println("Name :" +name);
 }
}
public class StudentInfo 
{
public static void main(String args[])throws IOException
 {
Student s=new Student();
DataInputStream ds=new DataInputStream(System.in);
System.out.print("Enter your Roll Number :-");
int rl=Integer.parseInt(ds.readLine());
System.out.print("Enter your Name :-");
String nm=ds.readLine();
s.getData(rl,nm);
s.show();
 }
} 

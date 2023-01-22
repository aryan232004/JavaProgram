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
public class StudentDemo 
{
public static void main(String args[])
 {
Student s=new Student();
int rl=Integer.parseInt(args[0]);
String nm=args[1];
s.getData(rl,nm);
s.show();
 }
} 
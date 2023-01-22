class AreaCircle
{
int r;
float a;
void getData(int x)
 {r=x;}
void show() 
{
a=3.14f*r*r;
System.out.println("Area of circle  :" +a);
 }
}
public class AreaCircleDemo 
{
public static void main(String args[])
 {
AreaCricle c= new AreaCricle();
int ra=Integer.parseInt(args[0]);
c.getData(ra);
c.show();
 }
} 
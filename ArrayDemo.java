import java.io.*;
class ArrayDemo
{
public static void main(String args[])throws IOException
 {
DataInputStream ds=new DataInputStream(System.in);
System.out.print("Enter a size of array :");
int n=Integer.parseInt(ds.readLine());
int []arr=new int[n];
int i;
for(i=0;i<n;i++)
   {
System.out.print("Enter element no : ["+(i+1)+"]  ");
arr[i]=Integer.parseInt(ds.readLine());
   }
System.out.println("\nthe array is :");
for(i=0;i<n;i++)
   {
System.out.print(arr[i]+"\t" );
   }
 }
}
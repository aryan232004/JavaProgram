class AscendingDesending
{
public static void main(String args[])
 {
int l,i,j,c=0;
l=args.length;
int []a=new int[l];
System.out.println("Elements of original array : ");
for(i=0;i<l;i++)
   {
a[i]=Integer.parseInt(args[i]);
System.out.println(a[i]+"\t");
   }
for(i=0;i<l;i++)
    {
for(j=i+1;j<l;j++)
     {
if(a[i]<a[j])
      {
c=a[i];
a[i]=a[j];
a[j]=c;
      }
     }
    }
System.out.println("\nElement of array sorted in Desending order :");
for(i=0;i<l;i++)
    {
System.out.println(a[i]+"\t");
    }
 }
}
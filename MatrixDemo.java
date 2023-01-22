import java.io.*;
import com.matrix.Matrix;
public class MatrixDemo {
    public static void main(String args[])throws IOException
    {
        DataInputStream ds= new DataInputStream(System.in);
        System.out.print("Enter number of rows :- ");
        int r=Integer.parseInt(ds.readLine());
        System.out.print("Enter number of colunms :- ");
        int c=Integer.parseInt(ds.readLine());
        Matrix m1=new Matrix(r,c);
        Matrix m2=new Matrix(r,c);
        Matrix m3=new Matrix(r,c);
        System.out.println("1 - Accept & display a matrix\n2 Addition of 2 matrices");
        System.out.println("3 - Transpose matrix");
        System.out.print("Enter your choice :-");
        int n=Integer.parseInt(ds.readLine());
        switch(n)
        {
            case 1:
              m1.getData();
	      System.out.println("The Mtrix is :");
              m1.show();
            break;
            case 2:
                m1.getData();
                m2.getData();
                m3.sum(m1,m2);
                System.out.println("1st Matrix :");
                m1.show();
                System.out.println("2nd Matrix :");
                m2.show();
                System.out.println("Addtion of both Matrices :");
                m3.show();
            break;
            case 3:
                m1.getData();
                m2.transpose(m1);
                System.out.println("The original Matrix is :");
                m1.show();
                System.out.println("The Transpose Matrix is :");
                m2.show();
            break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
package com.matrix;
import java.io.*;
public class Matrix {
    int i,j,m,n;
    int [][]a;
    DataInputStream ds;
    public Matrix(int x,int y)
    { m=x;n=y;
a=new int[m][n];
}
    public void getData()throws IOException
    {
        
        ds=new DataInputStream(System.in);
        System.out.println("Enter"+m+" x "+n+" matrix ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print("Enter element no. ["+(i+1)+","+(j+1)+"]: ");
                a[i][j]=Integer.parseInt(ds.readLine());
            }
        }
    }
   public void sum(Matrix x,Matrix y)
    {
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=x.a[i][j]+y.a[i][j];
            }
        }
    }
    public void transpose(Matrix x)
       {
           for(i=0;i<m;i++){
               for(j=0;j<n;j++){
                   a[i][j]=x.a[j][i];
               }
           }
       }
    public void show()
    {
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
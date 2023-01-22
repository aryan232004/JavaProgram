//uncompressing a file using an InflaterInputStream
import java.io.*;
import java.util.zip.*;

class UnZip
{
    public static void main(String[] args)throws Exception
    {
        //attach Input file:file2 to FileInputStream for reading data
        FileInputStream fis=new FileInputStream("MyFile2");

        //attach Output file:file3 to FileOutputStream for writing data into it
        FileOutputStream fos=new FileOutputStream("MyFile3.txt");

        //attach InflaterInputStream to FileInputStream for uncompressing the data
        InflaterInputStream iis=new InflaterInputStream(fis);

        //read data from InflaterInputStream and write it into FileOutput Stream
        int data;
        while((data = iis.read()) !=-1);
        fos.write(data);

        //close the files
        fos.close();
        iis.close();
    }
}
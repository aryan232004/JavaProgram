//compressing a file using a DeflaterOutputStream
import java.io.*;
import java.util.zip.*;
class Zip
{
    public static void main(String[] args)throws Exception
    {
        //attach the original file:file1 to FileInputStream for reading data
        FileInputStream fis=new FileInputStream("MyFile.txt");

        //attach compressed file:file2 to FileOutputStream
        FileOutputStream fos=new FileOutputStream("MyFile2");

        //attach FileOutputStream to DeflaterOutputStream
        DeflaterOutputStream dos=new DeflaterOutputStream(fos);

        //read data from FileOutputStream and write it into DefalterOutputStream
        int data;
        while((data = fis.read()) !=-1)
            dos.write(data);

        //close the file
        fis.close();
        dos.close();
    }
}
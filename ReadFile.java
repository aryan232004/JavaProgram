//Reading textfile using FileInputStream
import java.io.*;
class ReadFile
{
    public static void main(String[] args)throws IOException
    {
        //attach the file to FileInputStream
        FileInputStream fin=new FileInputStream("MyFile.txt");
        System.out.println("File contens:-");
        
        //read characters from FileInputStream and write them to monitor.
        // repeat this till the ens of file. 
        int ch;
        
        while((ch=fin.read())!= -1)
            System.out.print((char)ch);
        
        //close the file
        fin.close();
    }
}

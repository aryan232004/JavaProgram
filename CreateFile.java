//create a text file using FileoutputStream
import java.io.*;
class CreateFile
{
    public static void main(String[] args)throws IOException
    {
        //attach keyboard to DataInputStream
        DataInputStream ds=new DataInputStream(System.in);

        //attach myfile to FileOutStream
        FileOutputStream fout=new FileOutputStream("MyFile.txt");

        System.out.println("enter text(@ at the end)");

        char ch;

        //read characters from ds into ch.Then write them into fout.
        // repeat this as long as the read character is not @
        while((ch=(char)ds.read()) !='@')
            fout.write(ch);

        //close the file
        fout.close();
    }
}
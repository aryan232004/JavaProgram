//Server - A Client that send data and recieve also
import java.io.*;
import java.net.*;
class Client2
{
    public static void main(String[] args)throws Exception
    {
        //create Client socket
        Socket s= new Socket("Localhost",888);
        //to send data to the Server
        DataOutputStream ds=new DataOutputStream(s.getOutputStream());
        //to read data coming from server
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        //to read data from the keyboard
        BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
        String str,str1;
        //repeat as long as exit is not typed at Client
        while(!(str = kb.readLine()).equals("exit"))
            {
                ds.writeBytes(str+"\n");   //send to server
                str1=br.readLine();  //receive from server
                System.out.println(str1);
            }
        //close connection
        ds.close();
        br.close();
        kb.close();
        s.close();
    }
}
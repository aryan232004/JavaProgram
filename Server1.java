//Server1 - to send strings . Pahile server run karaycha nanter Client
import java.io.*;
import java.net.*;
class Server1
{
    public static void main(String[] args)throws Exception
    {
        //Create a server socket with some port number
        ServerSocket ss = new ServerSocket(777);
        //let the server wait till a client accept connection
        Socket s=ss.accept();
        System.out.println("Connection established");
        //attacch output stream to the server socket
        OutputStream obj=s.getOutputStream();
        //attach print stream to send data to the socket
        PrintStream ps=new PrintStream(obj);
        //send 2 string to the client
        String str="Hello Client";
        ps.println(str);
        ps.println("Bye");
        //close connection by closing the streams and sockets
        ps.close();
        ss.close();
        s.close();
    }
}
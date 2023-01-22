import java.awt.*;
import java.awt.event.*;
import com.closingpack.ClosingFrame;
public class MyFrameDemo
{
    public static void main(String args[])
    {
        //create a frame
        Frame f=new Frame("My AWT frame");
        //set the size of the frame
        f.setSize(300,250);
        //display the frame
        f.setVisible(true);
        f.addWindowListener(new ClosingFrame());
    }
}

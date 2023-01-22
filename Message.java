import java.awt.*;
import java.awt.event.*;
import com.closingpack.ClosingFrame;
public class Message extends Frame
{
    public void paint(Graphics g)
    {
        //set background color for frame
        this.setBackground(new Color(100,100,100));
        //set font for the text
        Font f = new Font("Arialinte",Font.BOLD+Font.ITALIC,30);
        g.setFont(f);
        //set foreground color
        g.setColor(Color.GREEN);
        //display the message
        g.drawString("Hello,How are you ?",100,100);
    }
    public static void main(String[] args)
    {
        Message m = new Message();
        m.setSize(400,300);
        m.setTitle("This is my text");
        m.setVisible(true);
        m.addWindowListener(new ClosingFrame());
    }
}
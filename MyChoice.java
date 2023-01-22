import java.awt.*;
import java.awt.event.*;
import com.closingpack.ClosingFrame;
public class MyChoice extends Frame implements ItemListener
{
    String msg;
    Choice ch;
    MyChoice()
    {
        setLayout(new FlowLayout());
        ch=new Choice();
        ch.add("English");
        ch.add("Sanakrit");
        ch.add("Marathi");	
        ch.add("Hindi");
        ch.add("Telugu");
        ch.add("French");
        ch.add("Korean");
        add(ch);
        ch.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("Selected Language:- ",10,100);
        msg=ch.getSelectedItem();
        g.drawString(msg,10,120);
    }
    public static void main(String[] args) 
    {
        MyChoice mc=new MyChoice();
        mc.setTitle("My Choice Box");
        mc.setSize(400,350);
        mc.setVisible(true);
        mc.addWindowListener(new ClosingFrame());
    }
}
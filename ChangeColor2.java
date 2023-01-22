import java.awt.*;
import java.awt.event.*;
import com.closingpack.ClosingFrame;
public class ChangeColor2 extends Frame implements ItemListener
{
    String cname;
    int rv,gv,bv;
    Choice ch;
    ChangeColor2()
    {
        setLayout(new FlowLayout());
        ch=new Choice();
        ch.add("Red");
        ch.add("Green");
        ch.add("Blue");
        add(ch);
        ch.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
//        g.drawString("Selected Color:- ",10,100);
        cname=ch.getSelectedItem();
//        g.drawString(msg,10,120);
        if(cname.equals("Red"))
            setBackground(Color.RED);
        else if (cname.equals("Green"))
            setBackground(Color.GREEN);
        else if (cname.equals("Blue"))
            setBackground(Color.BLUE);
    }
    public static void main(String[] args)
    {
        ChangeColor2 cc=new ChangeColor2();
        cc.setTitle("My Choice Box 2");
        cc.setSize(400,400);
        cc.setVisible(true);
        cc.addWindowListener(new ClosingFrame());
    }
}
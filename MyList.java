import java.awt.*;
import java.awt.event.*;
import com.closingpack.ClosingFrame;
public class MyList extends Frame implements ItemListener
{
    int[]msg;
    List l;
    MyList()
    {
        setLayout(new FlowLayout());
        l=new List(4,true);
        l.add("English");
        l.add("Sanakrit");
        l.add("Marathi");
        l.add("Hindi");
        l.add("Telugu");
        l.add("French");
        l.add("Korean");
        add(l);
        l.addItemListener(this);
    }
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        repaint();
    }
    public void paint (Graphics g)
    {
        g.drawString("Selected Language:- ",100,200);
        msg=l.getSelectedIndexes();
        for (int i=0;i<msg.length;i++)	
        {
            String item=l.getItem(msg[i]);
            g.drawString(item,100,220+i*20);
        }
    }
    public static void main(String[] args)
    {
        MyList ml=new MyList();
        ml.setTitle("My LIst Box");
        ml.setSize(400,400);
        ml.setVisible(true);
        ml.addWindowListener(new ClosingFrame());
    }
}

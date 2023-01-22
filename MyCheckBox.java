import javafx.stage.WindowEvent;

import java.awt.*;
import java.awt.event.*;
public class MyCheckBox extends Frame implements ItemListener {
    String msg="";
    Checkbox c1,c2,c3;
    MyCheckBox()
    {
        setLayout(new FlowLayout());

        c1= new Checkbox("Bold",true);
        c2=new Checkbox("Italic");
        c3=new Checkbox("Underline");

        add(c1);
        add(c2);
        add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("Current state:",10,100);
        msg="Bold:"+c1.getState();
        g.drawString(msg,10,120);
        msg="Italic:"+c2.getState();
        g.drawString(msg,10,140);
        msg="Underline:"+c3.getState();
        g.drawString(msg,10,160);
    }
    public static void main(String args[])
    {
        MyCheckBox mc= new MyCheckBox();
        mc.setTitle("My checkbox");
        mc.setSize(400,400);
        mc.setVisible(true);
    }
}

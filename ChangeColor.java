import java.awt.*;
import java.awt.event.*;
import com.closingpack.ClosingFrame;
public class ChangeColor extends Frame implements AdjustmentListener
{
    int rv,gv,bv;
    Scrollbar s1,s2,s3;
    ChangeColor()
    {
        setLayout(null);
        s1=new Scrollbar(Scrollbar.VERTICAL,0,0,0,225);
        s1.setBounds(250,50,30,200);
        add(s1);
        s1.addAdjustmentListener(this);
        s2=new Scrollbar(Scrollbar.VERTICAL,0,0,0,225);
        s2.setBounds(550,50,30,200);
        add(s2);
        s2.addAdjustmentListener(this);
        s3=new Scrollbar(Scrollbar.VERTICAL,0,0,0,225);
        s3.setBounds(850,50,30,200);
        add(s3);
        s3.addAdjustmentListener(this);
    }
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        repaint();
    }
    public void paint(Graphics g)
    {
        rv=s1.getValue();
        gv=s2.getValue();
        bv=s3.getValue();
        setBackground(new Color(rv,gv,bv));
    }
    public static void main(String[] args)
    {
        ChangeColor cc=new ChangeColor();
        cc.setTitle("My Scroll bar");
        cc.setSize(400,400);
        cc.setVisible(true);
        cc.addWindowListener(new ClosingFrame());
    }
}
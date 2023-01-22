import java.awt.*;
import java.awt.event.*;
public class Point extends Frame
{
    public void paint(Graphics g)
    {
        g.setColor(Color.WHITE);
        for(;;)
        {
            int x = (int) (Math.random() * 800);
            int y = (int) (Math.random() * 600);
            g.drawLine(x,y,x,y);
            try
            {
                Thread.sleep(20);
            }
            catch (InterruptedException ie){}
        }
    }

    public static void main(String[] args)
    {
        Point obj = new Point();
        obj.setBackground(Color.black);
        obj.setSize(500,400);
        obj.setTitle("Random Dots");
        obj.setVisible(true);
    }
}
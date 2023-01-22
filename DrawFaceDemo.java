import java.awt.*;
import java.awt.event.*;
import com.closingpack.ClosingFrame;
public class DrawFaceDemo extends Frame {
    public DrawFaceDemo(String x){
        super(x);
    }
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.drawOval(90,70,80,80);
        g.drawOval(110,95,5,5);
        g.drawOval(145,95,5,5);
        g.drawLine(130,95,130,115);
        g.drawArc(113,115,35,20,0,-180);
    }
    public static void main(String []args)
    {
        DrawFaceDemo df=new DrawFaceDemo("Face Drawing");
        df.setSize(400,400);
        df.setVisible(true);
        df.addWindowListener(new ClosingFrame());
    }
}
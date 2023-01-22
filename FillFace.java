import java.awt.*;
import java.awt.event.*;
import com.closingpack.ClosingFrame;
public class FillFace extends Frame {
    public FillFace(String x){
        super(x);
    }
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.drawOval(90,70,80,80);
        g.setColor(Color.DARK_GRAY);
        g.drawOval(110,95,5,5);
        g.setColor(Color.BLACK);
        g.drawOval(145,95,5,5);
        g.setColor(Color.GREEN);
        g.drawLine(130,95,130,115);
        g.setColor(Color.WHITE);
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

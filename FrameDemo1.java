//a simple frame with background color and text
import javax.swing.*;
import java.awt.*;    //Container class
class MyPanel extends JPanel
{
    MyPanel()
    {
        this.setBackground(Color.GREEN);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.setFont(new Font("Helvetica",Font.BOLD,34));
        g.drawString("HELLO LEARNERS !",50,100);
    }
}
class FrameDemo1 extends JFrame
{
    FrameDemo1()
    {
        //create content pane
        Container c= this.getContentPane();
        //create MyPanel object and add it to c
        MyPanel mp=new MyPanel();
        c.add(mp);
    }

    public static void main(String[] args)
    {
        //create the frame
        FrameDemo1 obj=new FrameDemo1();
        //set a title for the frame
        obj.setTitle("My Swing Frame");
        //set the size to 300by300 px
        obj.setSize(300,300);
        // display the Frame
        obj.setVisible(true);
        //Close the application upon clicking onclosing button of frame
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
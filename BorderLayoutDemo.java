//BorderLayout demo
import java.awt.*;
import javax.swing.*;
class BorderLayoutDemo extends JFrame
{
    BorderLayoutDemo()
    {
        //create content pane
        Container c=getContentPane();
        
        //create border layout with 10px horizontal and vertical gap between components
        BorderLayout obj=new BorderLayout(10,10);
        
        //set border layout to c
        c.setLayout(obj);
        
        //create 4 push buttons
        JButton b1,b2,b3,b4;
        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        
        //add buttons to c 
        c.add("North",b1);
        c.add("East",b2);
        c.add("South",b3);
        c.add("Center",b4);
        
        /*the above statements can be re-written as:
        c.add(b1,BorderLayout.NORTH);
        c.add(b2,BorderLayout.EAST);
        c.add(b3,BorderLayout.SOUTH);
        c.add(b4,BorderLayout.CENTER);
        */
    }

    public static void main(String[] args) 
    {
        //create the frame
        BorderLayoutDemo demo=new BorderLayoutDemo();
        demo.setSize(400,400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
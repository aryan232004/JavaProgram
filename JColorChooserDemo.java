//JColorChooser Demo
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JColorChooserDemo extends JFrame implements ActionListener
{
    //vars
    JButton b;
    Container c;
    JColorChooserDemo()
    {
        //create the content pane
        c=getContentPane();
        c.setLayout(new FlowLayout());
        
        //create a push button
        b=new JButton("Select a Color");
        
        //add buttons to content pane
        c.add(b);
        
        //add action listener to buttons
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        //take the initial color as null
        Color selectedcolor=null;
        
        //create the color chooser with dialog box select a color
        Color color=JColorChooser.showDialog(this,"Select a color",selectedcolor);
        
        //if color is not null then some color is selected 
        if (color !=null)
        {
            //get the selected color
            selectedcolor = color;
        }
        //show back ground color of frame with the selected color
        c.setBackground(color);
    }

    public static void main(String[] args) 
    {
        //create the frame
        JColorChooserDemo demo=new JColorChooserDemo();
        demo.setSize(400,400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
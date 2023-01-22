import java.awt.*;
import java.awt.event.*;
import com.closingpack.ClosingFrame;
public class Button2 extends Frame implements ActionListener
{
    //vars
    Button b1,b2,b3;
    Button2() {
        //do not set any layout
        this.setLayout(new FlowLayout());
        //create 3 push buttons
        b1 = new Button("Yellow");
        b2 = new Button("Blue");
        b3 = new Button("Pink");
        //add the button to the frame
        this.add(b1);
        this.add(b2);
        this.add(b3);
        //Add action listener to the buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    //this method is called when is buttons is clicked
    public void actionPerformed(ActionEvent ae)
    {
        //know the label of the buttons clicked by user
        if(ae.getSource() == b1)setBackground(Color.YELLOW);
        if(ae.getSource() == b2)setBackground(Color.BLUE);
        if(ae.getSource() == b3)setBackground(Color.PINK);
    }
    public static void main(String args[])
    {
        //Create a Frame
        Button2 mb= new Button2();
        mb.setSize(400,400);
        mb.setTitle("My Buttons");
        mb.setVisible(true);
        mb.addWindowListener(new ClosingFrame());
    }
}

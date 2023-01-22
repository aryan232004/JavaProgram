import java.awt.*;
import java.awt.event.*;
import com.closingpack.ClosingFrame;
public class Button1 extends Frame implements ActionListener
{
    //vars
    Button b1,b2,b3;
    Button1() {
        //do not set any layout
        this.setLayout(null);
        //create 3 push buttons
        b1 = new Button("Yellow");
        b2 = new Button("Blue");
        b3 = new Button("Pink");
        //set the location of buttons in the frame
        b1.setBounds(100, 100, 70, 40);
        b2.setBounds(100, 160, 70, 40);
        b3.setBounds(100, 220, 70, 40);
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
            String str= ae.getActionCommand();
            //Change the Frame background color depanding on the buttons
            //clicked
            if(str.equals("Yellow"))this.setBackground(Color.YELLOW);
            if(str.equals("Blue"))this.setBackground(Color.BLUE);
            if(str.equals("Pink"))this.setBackground(Color.PINK);
        }
        public static void main(String args[])
        {
            //Create a Frame
            Button1 mb= new Button1();
            mb.setSize(400,400);
            mb.setTitle("My Buttons");
            mb.setVisible(true);
            mb.addWindowListener(new ClosingFrame());
        }
    }

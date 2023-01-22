//checkbox demo
import java.awt.*;
import java.awt.event.*;
import com.closingpack.ClosingFrame;
class CheckboxDemo extends Frame implements ItemListener, ActionListener
{
    //vars
    String msg="";
    Checkbox c1,c2,c3;
    Button b1,b2,b3;
    CheckboxDemo()
    {
        //set flow layout manager
        this.setLayout(new FlowLayout());
        //display 3 checkboxes
        c1 = new Checkbox("Bold",true);
        c2 = new Checkbox("Italic");
        c3 = new Checkbox("Underline");
        //add the check boxes to the frame
        add(c1);
        add(c2);
        add(c3);
        //add item listener to the check boxes
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        //create 3 push button
        b1 = new Button("Yellow");
        b2 = new Button("Blue");
        b3 = new Button("Pink");
        //add the button to the frame
        this.add(b1);
        this.add(b2);
        this.add(b3);
        //add action listener to the button
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    //this method is called when the button is clicked
    public void actionPerformed(ActionEvent ae)
    {
        //know the label of the buttons clicked by user
        if(ae.getSource() == b1)setBackground(Color.YELLOW);
        if(ae.getSource() == b2)setBackground(Color.BLUE);
        if(ae.getSource() == b3)setBackground(Color.PINK);
    }
    //this method is called the user clicks on a check box
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();  //call paint() method
    }
    //display current state of checkboxes
    public void paint(Graphics g)
    {
        g.drawString("Current state:",10,100);
        msg = "Bold: "+c1.getState();
        g.drawString(msg,10,120);
        msg = "Italic: "+c2.getState();
        g.drawString(msg,10,140);
        msg = "Underline: "+c3.getState();
        g.drawString(msg,10,160);
    }
    public static void main(String[] args)
    {
        //create the frame
        CheckboxDemo mc = new CheckboxDemo();
        mc.setTitle("My Checkbox");
        mc.setSize(400,400);
        mc.setVisible(true);
        mc.addWindowListener(new ClosingFrame());

    }
}
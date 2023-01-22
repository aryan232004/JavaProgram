//check boxes,radio buttons and text area
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CheckRadio extends JFrame implements ActionListener
{
    //vars
    JCheckBox cb1,cb2;
    JRadioButton rb1,rb2;
    JTextArea ta;
    ButtonGroup bg;
    String msg="";
    CheckRadio()
    {
        //create the content pane
        Container c=getContentPane();
        
        //set flow layout to content pane
        c.setLayout(new FlowLayout());
        
        //create a text area with 10 rows and 20 chars per row
        ta=new JTextArea(10,20);
        
        //create two check boxes
        cb1=new JCheckBox("Java",true);
        cb2= new JCheckBox("J2EE");
        
        //create two radio buttons
        rb1=new JRadioButton("Male",true);
        rb2=new JRadioButton("Female");
        
        //create a buttons group and add the radio buttons to it
        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        
        //add the checkboxes,radio buttons,textarea to the container
        c.add(cb1);
        c.add(cb2);
        c.add(rb1);
        c.add(rb2);
        c.add(ta);
        
        //add action listeners.we need not add listener to textarea.
        //since the user clicks on the checkb oxes or radio button only
        cb1.addActionListener(this);
        cb2.addActionListener(this);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        
        //close the frame upon clicking
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        //know which component are selected by user
        if(cb1.getModel().isSelected()) msg+="\nJava";
        if(cb2.getModel().isSelected()) msg+="\nJ2EE";
        if(rb1.getModel().isSelected()) msg+="\nMale";
        else msg+="\nFemale";
        
        //display the selected message in the text area
        ta.setText(msg);
        
        //reset the message to empty string
        msg="";
    }

    public static void main(String[] args) 
    {
        //create frame
        CheckRadio cr=new CheckRadio();
        cr.setTitle("My Checkboxes and Radio Buttons");
        cr.setSize(500,400);
        cr.setVisible(true);
    }
}
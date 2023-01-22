//JToolBar
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JToolBarDemo extends JFrame implements ActionListener
{
    //vars
    String str;
    Container c;
    JToolBar tb;
    JButton b1,b2,b3;
    JLabel lbl;
    JToolBarDemo()
    {
        //create content pane
        c=getContentPane();
        
        //create tool bar
        c.setLayout(new BorderLayout());
        
        //set etched border around the tool bar
        tb.setBorder(BorderFactory.createEtchedBorder(Color.GREEN,Color.BLACK));
        
        //load images into imageIcon object 
        ImageIcon img1,img2,img3;
        img1=new ImageIcon("");
        img2=new ImageIcon("");
        img3=new ImageIcon("");
        
        //create 3 push buttons to the tool bar
        b1=new JButton(img1);
        b2=new JButton(img2);
        b3=new JButton(img3);
        
        //add the push buttons to the tool bar
        tb.add(b1);
        tb.add(b2);
        tb.add(b3);
        
        //add the tool bar in c at top
        c.add("North",tb);
        
        //create a label and add to c at center
        lbl=new JLabel();
        lbl.setFont(new Font("SansSerif",Font.PLAIN,30));
        c.add("Center",lbl);
        
        //add action listener to buttons in tool bar 
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        //know which buttons is click
        if(ae.getSource() ==b1) str = "new Clicked";
        if(ae.getSource() ==b2) str = "open Clicked";
        if(ae.getSource() ==b3) str = "Print Clicked";
        
        //display the string in the label
        lbl.setText(str);
    }
    public static void main(String[] args) 
    {
     //create the frame
     JToolBarDemo tbd=new JToolBarDemo();
     tbd.setSize(400,400);
     tbd.setVisible(true);
     tbd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
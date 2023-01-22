//Menu Creation
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyMenu extends JFrame implements  ActionListener
{
    //vars
    JMenuBar mb;
    JMenu file,edit,font;
    JMenuItem op,sa,cl,cp,pt,f1,f2;
    JCheckBoxMenuItem pr;
    MyMenu()
    {
        //create container
        Container c=getContentPane();
        c.setLayout(new BorderLayout());

        //create a menubar
        mb=new JMenuBar();

        //add menubar to container
        c.add("North",mb);

        //create the file,edit menu add attach them to menubar
        file=new JMenu("File");
        edit=new JMenu("Edit");
        mb.add(file);
        mb.add(edit);

        //create menu items
        op=new JMenuItem("Open");
        sa=new JMenuItem("Save");
        cl=new JMenuItem("Close");
        cp=new JMenuItem("Copy");
        pt=new JMenuItem("Paste");

        //add open,save,close to file menu and copy,paste to edit menu
        file.add(op);
        file.add(sa);
        file.add(cl);
        file.add(cp);
        file.add(pt);

        //make close disabled
        cl.setEnabled(false);

        //create print checkbox and it to file menu
        pr=new JCheckBoxMenuItem("Print");
        file.add(pr);

        //add a separator(horizontal line) to file menu
        file.addSeparator();

        //create a font submenu and add it to file menu
        font =new JMenu("Font");
        file.add(font);

        //create menu items
        f1=new JMenuItem("Arial");
        f2=new JMenuItem("Times New Roman");

        //add menu items to sub menu
        font.add(f1);
        font.add(f2);

        //attach action listener to all menu items
        op.addActionListener(this);
        sa.addActionListener(this);
        cl.addActionListener(this);
        cp.addActionListener(this);
        pt.addActionListener(this);
        pr.addActionListener(this);
        f1.addActionListener(this);
        f2.addActionListener(this);

        //close Frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //this method is executed when a menu item is clicked
    public void actionPerformed(ActionEvent ae)
    {
        //know which menu item is clicked
        if(op.isArmed()) System.out.println("Open is Selected");
        if(sa.isArmed()) System.out.println("Save is Selected");
        if(cl.isArmed()) System.out.println("Close is Selected");
        if(cp.isArmed()) System.out.println("Copy is Selected");
        if(pt.isArmed()) System.out.println("Paste is Selected");

        if(pr.getModel().isSelected()) System.out.println("Printing on....");
        else System.out.println("Printing off....");

        if(f1.isArmed()) System.out.println("Arial Font is Selected");
        if(f2.isArmed()) System.out.println("Times New Roman is Selected");
    }
    public static void main(String[] args)
    {
        //create the frame
        MyMenu mm=new MyMenu();
        mm.setTitle("JMenu Demo");
        mm.setSize(500,400);
        mm.setVisible(true);
    }
}
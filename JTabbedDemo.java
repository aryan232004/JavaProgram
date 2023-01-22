//Tabbed pane
import java.awt.*;
import javax.swing.*;
class JTabbedPaneDemo extends JFrame
{
    JTabbedPaneDemo()
    {
        //create content pane
        Container c=getContentPane();

        //create tabbed pane
        JTabbedPane jtp=new JTabbedPane();

        //add two sheets,CapitalPanel and CountriesPanel are classes
        //which extend Jpanel and Contain a group of components
        jtp.addTab("Capitals",new CapitalsPanel());
        jtp.addTab("Countries",new CountriesPanel());

        //add the tabbed pane to conent pane
        c.add(jtp);
    }

    public static void main(String[] args)
    {
        //create the frame
        JTabbedPaneDemo demo=new JTabbedPaneDemo();
        demo.setSize(300,400);
        demo.setVisible(true);
        demo.setTitle("JTabbed");

        //close the frame
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//the components of this class go into Capitals tab sheet
class CapitalsPanel extends JPanel
{
    CapitalsPanel()
    {
        //create 3 push buttons and add to panel
        JButton b1=new JButton("Washington");
        JButton b2=new JButton("London");
        JButton b3=new JButton("Tokyo");

        add(b1);
        add(b2);
        add(b3);
    }
}
//the components of this class appear in Countries tab sheet
class CountriesPanel extends JPanel
{
    CountriesPanel()
    {
        //create 3 check bokes and add to panel
        JCheckBox c1=new JCheckBox("UnitedStates");
        JCheckBox c2=new JCheckBox("Britain");
        JCheckBox c3=new JCheckBox("Japan");

        add(c1);
        add(c2);
        add(c3);
    }
}
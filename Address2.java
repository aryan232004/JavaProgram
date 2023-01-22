import java.awt.*;
import java.awt.event.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import com.closingpack.ClosingFrame;
public class Address2 extends Frame implements ActionListener
{
    Button b;
    TextField name;
    String site;
    Label l;
    Address2()
    {
        setLayout(null);
        l=new Label();
        name=new TextField(20);
        b=new Button("Show IP");
        name.setBounds(150,100,100,40);
        b.setBounds(100,150,70,40);
        l.setBounds(100,250,400,40);
        add(name);
        add(b);
        add(l);
        b.addActionListener(this);
    }
    public void paint(Graphics g)
    {
        g.drawString("Enter Site :- ",10,200);
        g.drawString("IP Address :- ",10,350);
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        site=name.getText();
        try {
            InetAddress ip=InetAddress.getByName(site);
            l.setText("IP : "+ip);
        } catch (UnknownHostException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void main(String[] args)
    {
        Address2 a=new Address2();
        a.setSize(400,400);
        a.setTitle("Show Site Address");
        a.setVisible(true);
        a.addWindowListener(new ClosingFrame());
    }
}

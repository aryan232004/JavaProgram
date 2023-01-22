import java.awt.*;
import java.awt.event.*;
import com.closingpack.ClosingFrame;
public class MyText extends Frame implements ActionListener
{
    TextField name,pass;
    MyText()
    {
        setLayout(new FlowLayout());
        Label n=new Label("Name: ",Label.LEFT);
        Label p=new Label("Pass Word: ",Label.LEFT);
        name=new TextField(20);
        pass=new TextField(20);
        pass.setEchoChar('*');
        name.setBackground(Color.BLUE);
        pass.setBackground(Color.RED);
        Font f=new Font("Arial",Font.PLAIN,25);
        name.setFont(f);
        add(n);
        add(name);
        add(p);
        add(pass);
        name.addActionListener(this);
        pass.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        Graphics g=this.getGraphics();
        g.drawString("Name:-"+name.getText(),10,200);
        g.drawString("PassWord:-"+pass.getText(),10,240);
    }
    public static void main(String[] args)
    {
        MyText mt=new MyText();
        mt.setTitle("My Text Field");
        mt.setSize(400,300);
        mt.setVisible(true);
        mt.addWindowListener(new ClosingFrame());
    }
}
import java.awt.*;
import java.awt.event.*;
import com.closingpack.ClosingFrame;
public class Keys extends Frame implements KeyListener
{
    TextArea ta;
    String msg="";
    Keys()
    {
        setLayout(new FlowLayout());
        ta=new TextArea(5,25);
        Font f=new Font("SansSerif",Font.BOLD,25);
        ta.setFont(f);
        ta.setForeground(Color.RED);
        add(ta);
        ta.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent ke) 
    {
        int keycode=ke.getKeyCode();
        msg+="\nKey Code:- "+keycode;
        String keyname=ke.getKeyText(keycode);
        msg+="\nKey Pressed:- "+keyname;
        ta.setText(msg);
        msg="";
    }
    @Override
    public void keyReleased(KeyEvent ke)
    {
        int keycode=ke.getKeyCode();
        msg+="\nKey Code:- "+keycode;
        String keyname=ke.getKeyText(keycode);
        msg+="\nKey Released:- "+keyname;
        ta.setText(msg);
        msg="";
    }
    public static void main(String[] args)
    {
        Keys ks=new Keys();
        ks.setTitle("Catch the Key");
        ks.setSize(400,400);
        ks.setVisible(true);
        ks.addWindowListener(new ClosingFrame());
    }
}
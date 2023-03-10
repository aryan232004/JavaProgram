//JProgressBar
import java.awt.*;
import javax.swing.*;
class ProgressDemo extends JFrame {
    //vars
    JProgressBar bar;

    ProgressDemo() {
        //go to the content pane
        Container c= getContentPane();
        
        //set flow layout manager
        c.setLayout(new FlowLayout());
        
        //create progress bar with 0min value and 2000 as max value
        bar=new JProgressBar(0,2000);
        
        //set foreground color as green
        bar.setForeground(Color.GREEN);
        
        //to display percentage of progress
        bar.setStringPainted(true);
        
        //add the progress bar to content pane
        c.add(bar);
    }
    void increase()
    {
        //repeat the loop in steps of 10 if step size is less,slow progress 
        for (int i=0;i<=2000;i+=10)
        {
            //set the value of the progress bar to i
            bar.setValue(i);
            
            //delay for 20 millisecond
            try{
                Thread.sleep(20);
            }catch(InterruptedException ie){}
        }
    }

    public static void main(String[] args) 
    {
        //display the frame
        ProgressDemo d=new ProgressDemo();
        d.setSize(400,400);
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //show the progress in the progress bar
        d.increase();
    }
}    
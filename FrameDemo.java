import javax.swing.*;
class FrameDemo extends JFrame
{
    public static void main(String[] args) 
    {
        //create the Frame
        FrameDemo obj=new FrameDemo();
        //set a title for the frame
        obj.setTitle("My Swing Frame");
        //set size to 200 by 200 px
        obj.setSize(200,200);
        //display the frame
        obj.setVisible(true);
        //close the application upon Clicking on close Button of Frame
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
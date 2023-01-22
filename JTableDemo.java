//JTable demo
import java.awt.*;  //Container
import java.util.*;  //Vector
import javax.swing.*;   //JTable
import javax.swing.table.*;  //JTableHeader
import javax.swing.border.*;  //Border
class JTableDemo extends JFrame
{
    JTableDemo()
    {
        //take Vector object to represent data of table
        Vector<Vector> data=new Vector<Vector>();

        //take another Vectior object to represent a row
        Vector<String> row=new Vector<String>();

        //add 3 column's data to row
        row.add("Piyush");
        row.add("Analyst");
        row.add("22,000,00");

        //add the row to data of the table
        data.add(row);

        //create another row
        row=new Vector<String>();
        row.add("Aryan");
        row.add("Programmer");
        row.add("100,000,00");

        //add the second row also to data
        data.add(row);

        //create third row
        row=new Vector<String>();
        row.add("Atit");
        row.add("Programmer");
        row.add("16,000,00");

        //add the third row also to data
        data.add(row);

        //create another vector object for column names
        Vector<String> colm=new Vector<String>();
        colm.add("Employee Name");
        colm.add("Designation");
        colm.add("Salary");

        //do not add column names to data table

        //create the Table
        JTable tab=new JTable(data,colm);

        //set green line border to the table
        tab.setBorder(BorderFactory.createLineBorder(Color.GREEN,2));

        //set some font to the table
        tab.setFont(new Font("Arial",Font.BOLD,20));

        //set row height to 30px
        tab.setRowHeight(30);

        //set grid color to red
        tab.setGridColor(Color.RED);

        //get the table header into head
        JTableHeader head=tab.getTableHeader();

        //create content pane
        Container c=getContentPane();

        //set border layout to content pane
        c.setLayout(new BorderLayout());

        //add head of the table at top and remaining table below the top
        c.add("North",head);
        c.add("Center",tab);
    }

    public static void main(String[] args)
    {
        //create the frame
        JTableDemo demo=new JTableDemo();
        demo.setSize(500,400);
        demo.setVisible(true);
        demo.setTitle("JTable");

        //close the frame
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
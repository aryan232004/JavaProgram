// creating a frame
package com.closingpack;
import java.awt.*; //inbuild package for developing GUI program
import java.awt.event.*;
public class ClosingFrame implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {    }
    @Override
    public void windowClosing(WindowEvent e) 
    {
        System.exit(0);
    }
    @Override
    public void windowClosed(WindowEvent e) {   }

    @Override
    public void windowIconified(WindowEvent e) {    }

    @Override
    public void windowDeiconified(WindowEvent e) {   }

    @Override
    public void windowActivated(WindowEvent e) {   }
    @Override
    public void windowDeactivated(WindowEvent e) {   }
}

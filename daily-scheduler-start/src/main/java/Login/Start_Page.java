/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.*;
import java.awt.*;
import test.Login;

/**
 *
 * @author 영
 */
public class Start_Page extends JFrame {

    /**
     * @param args the command line arguments
     */
    
    public Start_Page(){
        setSize(1000,1000);
        setTitle("Start_Page");
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Start_Page s = new Start_Page();
        LogIn lg = new LogIn();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //this.dispose();
    }
    
}

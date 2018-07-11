/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.swing.JFrame;
import javax.swing.JLabel;



/**
 *
 * @author vip
 */
public class HelloSwing{
    public static void main(String[] args) {
        JFrame win = new JFrame("Demo");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(300,200);
        win.setLocationRelativeTo(null);
        win.setResizable(false);
        win.add(new JLabel("Hello world!"));
        win.setVisible(true);        
    }
}

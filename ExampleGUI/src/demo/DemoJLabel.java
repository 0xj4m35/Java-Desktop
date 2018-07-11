/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author vip
 */
public class DemoJLabel extends JFrame{
    public DemoJLabel(){
        setLayout(new GridLayout(1,3,5,5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Icon icon = new ImageIcon("pic_8.jpg");
        JLabel lb1 = new JLabel("Nhan la text");
        JLabel lb2 = new JLabel(icon);
        JLabel lb3 = new JLabel("icon va text", 
                icon, JLabel.CENTER);
        lb3.setVerticalTextPosition(JLabel.BOTTOM);
        lb3.setHorizontalTextPosition(JLabel.CENTER);
        add(lb1);
        add(lb2);
        add(lb3);
        pack();
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new DemoJLabel().setVisible(true);
    }
}

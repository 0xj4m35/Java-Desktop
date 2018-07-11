/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author vip
 */
public class DemoJPanel extends JFrame{
    public DemoJPanel(){
        setTitle("Demo JPanel");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p=new JPanel();
        //p.setBorder(BorderFactory.createLineBorder(Color.RED,4));
        p.setBorder(BorderFactory.createTitledBorder(
                "thong tin sach"));
        p.add(new JLabel("Thu co nhan!"));
        p.add(new JButton("An toi"));
        this.add(p);
    }
    public static void main(String[] args) {
        new DemoJPanel().setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author vip
 */
public class DemoJLabelwithColor extends JFrame {
    public DemoJLabelwithColor(){
        setLayout(new GridLayout(1, 2, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        JLabel lb;
        lb = createJLabel("Vi du 1", Color.red, Color.green);
        Font font=new Font("Arial",Font.BOLD,40);
        lb.setFont(font);
        add(lb);
        font=new Font("Tahoma",Font.BOLD,60);
        lb = createJLabel("Vi du 2", Color.blue, Color.yellow);
        lb.setFont(font);
        add(lb);         
        setLocationRelativeTo(null);
    }
    private JLabel createJLabel(String text, Color textColor,
            Color backgroundColor) {
        JLabel lb = new JLabel(text);
        lb.setHorizontalAlignment(JLabel.CENTER);
        lb.setForeground(textColor);
        lb.setOpaque(true);
        lb.setBackground(backgroundColor);
        return lb;
    }
    public static void main(String[] args) {
        new DemoJLabelwithColor().setVisible(true);
    }
}

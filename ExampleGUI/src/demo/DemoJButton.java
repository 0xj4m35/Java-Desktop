/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 *
 * @author vip
 */
public class DemoJButton extends JFrame {
    JButton b1,b2;
    public DemoJButton(){
        super("Vi du Button");        
        b1= new JButton("Dung lai", new ImageIcon("stop.png"));
        b2= new JButton("Thuc hien", new ImageIcon("go.png"));
        JPanel p = new JPanel();
        p.add(b1);
        p.add(b2);
        add(p);
        setSize(300,200);
        
    }
    public static void main(String[] args) {
        new DemoJButton().setVisible(true);
    }
}

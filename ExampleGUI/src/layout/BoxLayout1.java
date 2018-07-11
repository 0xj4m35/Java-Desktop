/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author vip
 */
public class BoxLayout1 extends JFrame{
    public BoxLayout1(){
        setTitle("Vi du Box Layout login");
        setSize(300,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
        p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
        p1.add(new JLabel("Nhap ten: "));
        p1.add(new JTextField(15));
        p2.add(new JLabel("Mat khau: "));
        p2.add(new JPasswordField(15));
        p.add(Box.createRigidArea(new Dimension(10, 10)));
        p.add(p1);
        p.add(Box.createRigidArea(new Dimension(10, 10)));
        p.add(p2);
        this.add(p,BorderLayout.NORTH);
    }
    public static void main(String[] args) {
        new BoxLayout1().setVisible(true);
    }
}

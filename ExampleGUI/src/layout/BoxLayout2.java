/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author vip
 */
public class BoxLayout2 extends JFrame {
    public BoxLayout2(){
        setTitle("Vi du Box Layout login");
        setSize(300,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Box b=Box.createVerticalBox();
        Box p1=Box.createHorizontalBox();
        Box p2=Box.createHorizontalBox();
        p1.add(new JLabel("Nhap ten: "));
        p1.add(new JTextField(15));
        p2.add(new JLabel("Mat khau: "));
        p2.add(new JPasswordField(15));
        b.add(Box.createRigidArea(new Dimension(10, 10)));
        b.add(p1);
        b.add(Box.createRigidArea(new Dimension(10, 10)));
        b.add(p2);
        this.add(b,BorderLayout.NORTH);
    }    
    public static void main(String[] args) {
        new BoxLayout2().setVisible(true);
    }
}

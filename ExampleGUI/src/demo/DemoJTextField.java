/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author vip
 */
public class DemoJTextField extends JFrame {
    JTextField ten;
    JPasswordField matkhau;
    public DemoJTextField(){
        super("Vi du nhap lieu");
        JPanel p =new JPanel();
        p.add(new JLabel("Ten: "));
        p.add(new JTextField(15));
        p.add(new JLabel("Mat khau:"));
        p.add(new JPasswordField(15));
        p.add(new JTextArea(5,15));
        add(p);
        //p.add(new JTextArea(15,5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 200);
    }
    public static void main(String[] args) {
        new DemoJTextField().setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Nguyen Thai Bao
 */
public class Login extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOK) { // if e.getActionCommand().equals("OK");
            String name = txtName.getText();
            JOptionPane.showMessageDialog(/*Login.this*/ null , "Welcome " + name); // Null : appear in the middle of screen
        }
    }

    JLabel lblName;
    JTextField txtName;
    JButton btnOK;
    
    public Login() {
        super("Login Dialog");
    }
    
    public void createAndShow() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 8, 8));
        c.add(lblName = new JLabel("Enter your Name: "));
        c.add(txtName = new JTextField(20));
        txtName.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(btnOK = new JButton("OK"));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(600, 250);
        pack();
        btnOK.addActionListener(this);
    }
    
    public static void main(String[] args) {
        new Login().createAndShow();
    }
}

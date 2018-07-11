/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author vip
 */
public class DemoLogin extends JFrame 
        implements ActionListener{
    private	JButton	bLogon;
    private	JButton	bExit;
    private	JTextField	username;
    private	JPasswordField	pass;
    public DemoLogin(){
        setTitle("Logon	program");
        setSize(500,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        buildGUI();
    }
    private void buildGUI()	{
        JPanel	p1=new	JPanel();
        p1.setBorder(BorderFactory.createLineBorder(Color.red));
        JLabel	tieude;
        p1.add(tieude = new JLabel("DANG NHAP"));
        tieude.setFont(new Font("Arial", Font.BOLD, 30));
        tieude.setForeground(Color.red);
        add(p1,BorderLayout.NORTH);
        JPanel	p2 = new JPanel();
        p2.setBorder(BorderFactory.createLineBorder(Color.red));
        p2.add(bLogon=new JButton("Dang Nhap"));
        p2.add(bExit=new JButton("Exit"));
        add(p2,BorderLayout.SOUTH);
        
        JPanel	p3=new JPanel();
        p3.setBorder(BorderFactory.createLineBorder(Color.red));
        Box	b=Box.createVerticalBox();
        Box	b1=Box.createHorizontalBox();
        Box	b2=Box.createHorizontalBox();
        JLabel	lblUser, lblPass;
        b1.add(lblUser=new JLabel("Tên:	"));
        lblUser.setFont(new Font("Arial", Font.PLAIN, 15));
        b1.add(username= new JTextField(20));
        b2.add(lblPass=new JLabel("Mat khau:  "));
        lblPass.setFont(new Font("Arial", Font.PLAIN, 15));
        b2.add(pass=new	JPasswordField(20));
        lblUser.setPreferredSize(lblPass.getPreferredSize());        
        b.add(Box.createVerticalStrut(50));
        b.add(b1);
        b.add(Box.createVerticalStrut(10));
        b.add(b2);
        p3.add(b);
        add(p3,BorderLayout.CENTER);   
        username.addActionListener(this);
        pass.addActionListener(this);
        bLogon.addActionListener(this);
        bExit.addActionListener(this);
    }        
    @Override
    public void actionPerformed(ActionEvent e) { 
        if(e.getSource()==bLogon){
            if(username.getText().equalsIgnoreCase("anh") 
               && pass.getText().equalsIgnoreCase("anh")){
                dispose();
               JOptionPane.showMessageDialog(null,"Dang nhap thanh cong!!!");
            }
            else{
               JOptionPane.showMessageDialog(null,"Dang nhap sai!!!");
               username.requestFocus();
            }            
        }
        else if(e.getSource()==bExit){               
                System.exit(0);
        }
    }
    public static void main(String[] args) {
        new DemoLogin().setVisible(true);
    }
}

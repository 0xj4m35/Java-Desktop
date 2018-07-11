/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
/**
 *
 * @author vip
 */
public class Main2 extends JFrame 
        implements ActionListener {
    JLabel lbl_r,lbl_s;
    JTextField txt_r;
    JButton bt_cal,bt_exit;
    JPanel p1,p2;
    public Main2(){
        this.setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1=new JPanel();
        p2=new JPanel();
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.SOUTH);
        
        p1.setLayout(new GridLayout(2,2));
        lbl_r=new JLabel("Ban kinh");
        p1.add(lbl_r);
        txt_r=new JTextField("1");
        p1.add(txt_r);
        lbl_s=new JLabel("Dien tich");
        p1.add(lbl_s);
        bt_cal=new JButton("Cal");
        p2.add(bt_cal);
        bt_exit=new JButton("Exit");
        p2.add(bt_exit);
        bt_cal.addActionListener(this);
        bt_exit.addActionListener(this);
        setVisible(true);
    }
    public static void main(String[] args) {
        Main2 m=new Main2();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==bt_cal){
            double r=Double.parseDouble(txt_r.getText());
            double s=r*r*Math.PI;
            DecimalFormat f=new DecimalFormat("##.###");
            lbl_s.setText("Dien tich: "+f.format(s));
            //lbl_s.setText("Dien tich: "+s);
        }
        if(ae.getSource()==bt_exit)
            System.exit(0);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame
     implements ActionListener{
    JLabel lbr,lbs;
    JTextField tfr;
    JButton btCal,btExit;
    JPanel p1,p2;    
    public Main(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        lbr=new JLabel("ban kinh:");
        lbs=new JLabel("Dien tich:");
        tfr=new JTextField("1");
        btCal=new JButton("Cal");
        btExit=new JButton("Exit");
        p1=new JPanel();
        p2=new JPanel();
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.SOUTH); 
        p1.setLayout(new GridLayout(2, 2));
        p1.add(lbr);
        p1.add(tfr);
        p1.add(lbs);
        p2.add(btCal);
        p2.add(btExit); 
        btCal.addActionListener(this);
        btExit.addActionListener(this);
    }
    public static void main(String[] args) {
        Main m=new Main();
        m.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==btExit){           
            System.exit(0);
        }
        if(ae.getSource()==btCal){
            lbs.setText("bbbbb");
        }
    }
}

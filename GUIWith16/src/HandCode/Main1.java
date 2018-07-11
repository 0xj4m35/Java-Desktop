/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HandCode;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Nguyen Thai Bao
 */
public class Main1 extends JFrame implements ActionListener {
    
    JLabel lblr, lbls;
    JTextField txtr;
    JButton btnCal, btnExit;

    public Main1() throws HeadlessException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tinh Dien Tich");
        setLocationRelativeTo(this);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.SOUTH);
        p1.setLayout(new GridLayout(2,2));
        p1.add(lblr = new JLabel("Nhap ban kinh: "));
        p1.add(txtr = new JTextField(10));
        p1.add(lbls = new JLabel("Dien tich: "));
        p2.add(btnCal = new JButton("Calculate"));
        p2.add(btnExit = new JButton("Exit"));
        pack();
        btnCal.addActionListener(this);
        btnExit.addActionListener(this);
    }
    
    public static void main(String[] args) {
        Main1 m = new Main1();
        m.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnExit) {
            System.exit(0);
        }
        else 
            if (e.getSource() == btnCal) {
                double r, s;
                r = Double.parseDouble(txtr.getText().trim());
                s = Math.PI * r * r;
                DecimalFormat f = new DecimalFormat("##.##");
                lbls.setText("Dien tich: " + f.format(s));
            }
    }
    
    
}

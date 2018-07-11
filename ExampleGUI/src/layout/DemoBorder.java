/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author vip
 */
public class DemoBorder extends JFrame {
    public DemoBorder(){
        setLayout(new BorderLayout(2,2));
        setTitle("Demo form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        JPanel p1 = new JPanel(new BorderLayout(2,2));
        p1.setBorder(new TitledBorder("BorderLayout"));
        JPanel p2 = new JPanel(new GridLayout(0,1,1,1));
        p2.setBorder(new TitledBorder("GridLayout"));
        JPanel p3 = new JPanel(new GridLayout(0,1,1,1));
        p3.setBorder(new TitledBorder("GridLayout"));
        for (int ii=1; ii<4; ii++) {
            p2.add(new JLabel("Label " + ii));
            
            p3.add(new JTextField(10));
        }
        p1.add(p2, BorderLayout.CENTER);
        p1.add(p3, BorderLayout.EAST);
        JPanel p4 = new JPanel(new BorderLayout(2,2));
        p4.setBorder(new TitledBorder("BorderLayout"));
        JPanel p5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p5.setBorder(new TitledBorder("FlowLayout"));
        p5.add( new JButton("Click Me") );
        p4.add( p5, BorderLayout.NORTH );
        p4.add(new JScrollPane(new JTextArea(5,30)));
        add(p1, BorderLayout.NORTH);
        add(p4, BorderLayout.SOUTH);
        
    }
    public static void main(String[] args) {
        new DemoBorder().setVisible(true);
    }
}

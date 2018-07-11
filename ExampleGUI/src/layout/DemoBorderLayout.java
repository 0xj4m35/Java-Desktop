/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author vip
 */
public class DemoBorderLayout extends JFrame{
    private JButton	
    bn=new JButton("North"),
    bs=new JButton("South"),
    be=new JButton("East"),
    bw=new JButton("West"),
    bc=new JButton("Center");
    public DemoBorderLayout()	{
        setTitle("Vi du BorderLayout");
        setSize(300,200);	
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);	
        setResizable(false);	
        add(BorderLayout.NORTH, bn);	
        add(BorderLayout.SOUTH, bs);	
        add(BorderLayout.EAST, be);	
        add(BorderLayout.WEST, bw);	
        add(BorderLayout.CENTER, bc);
        bn.setBackground(Color.red);
        bs.setBackground(Color.red);
        bc.setBackground(Color.YELLOW);
        be.setBackground(Color.BLUE);
        bw.setBackground(Color.BLUE);
        
        bn.setForeground(Color.WHITE);
        bs.setForeground(Color.WHITE);
        bc.setForeground(Color.black);
        be.setForeground(Color.WHITE);
        bw.setForeground(Color.WHITE);
    }
    public static void main(String[] args)	{
        new DemoBorderLayout().setVisible(true);	
    }	
}

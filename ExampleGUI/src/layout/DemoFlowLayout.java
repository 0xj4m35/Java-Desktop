/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author vip
 */
public class DemoFlowLayout extends JFrame{
    public	DemoFlowLayout()	{
        setTitle("Vi du FlowLayout");
        setSize(300,250);	
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);	
        setResizable(false);	
        setLayout(new FlowLayout(FlowLayout.LEFT));
        for(int	i=1;i<=20;i++){
            add(new JButton("Button "+i));
        }
    }
    public static void main(String[] args)	{
        new DemoFlowLayout().setVisible(true);
    }	
}

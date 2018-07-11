/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author vip
 */
public class DemoGridLayout1 extends JFrame {
    public DemoGridLayout1() { 
        initUI();
    }
    public final void initUI() {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setLayout(new GridLayout(5, 4, 5, 5));
        String[] buttons = {
            "Cls", "Bck", "", "Close", 
            "7", "8", "9", "/", 
            "4", "5", "6", "*", 
            "1", "2", "3", "-", 
            "0", ".", "=", "+"
        };
        for (int i = 0; i < buttons.length; i++) {
            if (i == 2)
                panel.add(new JLabel(buttons[i]));
            else
                panel.add(new JButton(buttons[i]));
        }
        add(panel);
        setTitle("Vi du GridLayout");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                DemoGridLayout1 ex = new DemoGridLayout1();
                ex.setVisible(true);
            }
        });
    }
}
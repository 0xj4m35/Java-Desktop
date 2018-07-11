/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupcheck;

import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author vip
 */
public class Main {
    public static void main(String[] args) {
        new Main();
    }
    public Main() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
                JFrame frame = new JFrame("Testing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new GridLayout(0, 2));
                frame.add(new CheckBoxGroup(new String[]{"Bananas", "Oranages", "Apples", "Pears"}));
                frame.add(new CheckBoxGroup(new String[]{"Learn Archery", "Float in the dead sea", "Swing with a whale shark", "Sail the greek islands", "Go skydiving", "Dance in the rain", "Cycle through the Netherlands"}));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}

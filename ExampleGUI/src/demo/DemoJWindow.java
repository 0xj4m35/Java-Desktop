/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.swing.JFrame;
import javax.swing.JWindow;

/**
 *
 * @author vip
 */
public class DemoJWindow extends JWindow {
    private String message; 
    public DemoJWindow(JFrame parent,String message){  
        super(parent);
        this.message = message; 
        setSize(300, 300);
        setLocationRelativeTo(parent);
    }
    public static void main(String[] args) {
       JFrame main=new JFrame("Demo");
       main.setSize(400,400);
       DemoJWindow win=   new DemoJWindow(main,"Vi du window");       
       main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       main.setVisible(true);
    }
}

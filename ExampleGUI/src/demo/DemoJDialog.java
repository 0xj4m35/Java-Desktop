/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.swing.JDialog;

/**
 *
 * @author vip
 */
public	class DemoJDialog extends JDialog{
  public DemoJDialog(){
    setTitle("Demo JDialog");
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setSize(300,200);
    setModal(true);
    setResizable(false);
  }
  public static	void main(String[] args){
    new	DemoJDialog().setVisible(true);	
  }	
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.com.usol_v.practice2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Nguyen Thai Bao
 */
public class PersonalFrame extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean isSuit = false;
        if (e.getSource() == btnCheck) {
            String name = txtName.getText().trim();
            String mark = txtMark.getText().trim();
            String notice;
            if (name == "" || name == null || mark == null || mark == "") {
                notice = "「名前」と「得点」を入力してから、判定ボタンをクリックしてください。";
            }
            else {
                notice = getNotice(mark);
            }
            lblNoti.setText(notice);
        }
        else
            if (e.getSource() == btnExit) {
                this.dispose();
            }
    }
    
    JLabel lblHeader, lblName, lblMark, lblNoti;
    JTextField txtName, txtMark;
    JButton btnCheck, btnExit;

    public String getNotice(String mark) {
        int x = Integer.parseInt(mark.trim());
        if (x < 0 || x > 100) {
            return "得点は0から100の数字を入力してください";
        }
        if (x>=0 && x<=49) {
            return "もっと頑張りましょう (hãy cố gắng hơn)";
        }
        if (x >= 50 && x<=79) {
            return "もう少し頑張りましょう (hãy cố gắng thêm một chút nữa) ";
        }
        if (x >= 80 && x <=99) {
            return "よくできました！(Good！)";
        }
        if (x == 100) {
            return "大変よくできました！！(Very good！！)";
        }
        return "  ";
    }
    
    public PersonalFrame() throws HeadlessException {
        super("Practice01");
    }
    
    public void createAndShow() {
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(lblHeader = new JLabel("「名前」と「得点」を入力してから、判定ボタンをクリックしてください。"), BorderLayout.PAGE_START);
        JPanel c2 = new JPanel();
        c2.setLayout(new GridLayout(3, 2, 30, 30));
        c2.add(lblName = new JLabel("名前(Name)"));
        c2.add(txtName = new JTextField(20));
        c2.add(lblMark = new JLabel("得点(Mark)"));
        c2.add(txtMark = new JTextField(20));
        c2.add(btnCheck = new JButton("判定(Decision)"));
        c2.add(btnExit = new JButton("終了(Finish)"));
        c.add(c2, BorderLayout.CENTER);
        c.add(lblNoti = new JLabel(" "), BorderLayout.PAGE_END);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        btnCheck.addActionListener(this);
        btnExit.addActionListener(this);
    }
}

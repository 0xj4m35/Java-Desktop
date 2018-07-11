/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlist;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author vip
 */
public class DemoList extends JFrame 
        implements ActionListener {
    private int width = 200;
    private int height = 250;
    private JTextField tfAdd;
    private JList<String> list;
    public DemoList() {
        add(taoNoiDung());
        setTitle("Vi du JList");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private JPanel taoNoiDung() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(new EmptyBorder(0, 10, 10, 10));
        panel.add(createDeletePanel(), BorderLayout.PAGE_START);
        panel.add(createAddPanel(), BorderLayout.PAGE_END);
        panel.add(createList(), BorderLayout.CENTER);
        return panel;
    }
    private JPanel createDeletePanel() {
        JPanel panel = new JPanel();
        panel.add(createButton("Delete"));
        return panel;
    }
     private JPanel createAddPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.add(tfAdd = new JTextField());
        panel.add(createButton("Add"));
        return panel;
    }
    private JList<String> createList() {
        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement("CNTT");
        model.addElement("DTVT");
        list = new JList<String>(model);        
        return list;
    }
    private JButton createButton(String btnName) {
        JButton btn = new JButton(btnName);
        btn.addActionListener(this);
        return btn;
    }
    private void deleteItem() {
        DefaultListModel<String> model = (DefaultListModel<String>) list.getModel();
        if (!model.isEmpty() && list.getSelectedIndex() >= 0) {
            model.remove(list.getSelectedIndex());
        }
        else
            JOptionPane.showMessageDialog(null,"Chon muc de xoa!", "Error",JOptionPane.ERROR_MESSAGE);
        list.setModel(model);
    }
    private void addItem() {
        String item = tfAdd.getText().trim();
        if (item.equals("")) {
            JOptionPane.showMessageDialog(null,"khong de trong!", "Error",JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultListModel model = (DefaultListModel) list.getModel();
            model.addElement(item);
            list.setModel(model);
            tfAdd.setText("");
        }
    }      
    public static void main(String[] args) {
        new DemoList();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Delete") {
            deleteItem();
            return;
        }
        if (e.getActionCommand() == "Add") {
            addItem();
        }
    }
}
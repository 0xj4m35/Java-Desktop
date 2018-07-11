/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tab;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
public class TabbedPane {
    private static void showGUI() {
        final JFrame m = new JFrame("Tabbed Pane Example");
        m.setSize(400, 400);
        m.setVisible(true);
	m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setLayout(new GridLayout(1, 1));
        JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP);
        tab.addTab("Tab1", addPanel("This is tab 1"));
        tab.addTab("Tab2", addPanel("This is tab 2"));
        tab.addTab("Tab3", addPanel("This is tab 3"));
        tab.addTab("Tab4", addPanel("This is tab 4"));
        m.add(tab);
        int selectedIndex = tab.getSelectedIndex();
        System.out.println("Default Index:" + selectedIndex);
        tab.setSelectedIndex(tab.getTabCount()-1);
        selectedIndex = tab.getSelectedIndex();
        System.out.println("Index:" + selectedIndex);
    }
    private static JPanel addPanel(String text) {
        JPanel p = new JPanel();
        p.add(new JLabel(text));
        p.setLayout(new GridLayout(1, 1));
        return p;
    }
    public static void main(String[] args) {
        showGUI();
    }
}


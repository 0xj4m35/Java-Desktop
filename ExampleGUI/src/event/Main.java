
package event;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author vip
 */
public class Main {
  public static void main(String[] args) {
    JFrame m = new JFrame();

    JPanel p1 = new JPanel();
    final ButtonGroup bg = new ButtonGroup();
    JRadioButton radioButton;
    p1.add(radioButton = new JRadioButton("A"));
    radioButton.setActionCommand("A");
    bg.add(radioButton);
    p1.add(radioButton = new JRadioButton("B"));
    radioButton.setActionCommand("B");
    bg.add(radioButton);
    p1.add(radioButton = new JRadioButton("C", true));
    radioButton.setActionCommand("C");
    bg.add(radioButton);

    final JPanel p2 = new JPanel();
    p2.add(new JCheckBox("Ketchup"));
    p2.add(new JCheckBox("Mustard"));
    p2.add(new JCheckBox("Pickles"));

    JPanel orderPanel = new JPanel();
    JButton orderButton = new JButton("Place Order");
    orderPanel.add(orderButton);

    m.setLayout(new GridLayout(3, 1));
    m.add(p1);
    m.add(p2);
    m.add(orderPanel);

    orderButton.addActionListener(new ActionListener() {      
        @Override
        public void actionPerformed(ActionEvent ae) {
            String select = bg.getSelection().getActionCommand();
        System.out.println(select + " sandwich");
        Component[] components = p2.getComponents();
        for (Component c : components) {
          JCheckBox cb = (JCheckBox) c;
          if (cb.isSelected())
            System.out.println("With " + cb.getText());
        }
        }
    });

    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    m.setSize(300, 150);
    m.setVisible(true);
  }
}
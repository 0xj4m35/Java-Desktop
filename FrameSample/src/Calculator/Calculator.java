
package Calculator;

import com.sun.javafx.binding.StringFormatter;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Calculator extends JFrame {
    
    class ButtonHandler implements ActionListener {
        
        double num1 = 0, num2 = 0;
        String ope = "";
        
        boolean isOperator(String c) {
            char x = c.charAt(0);
            return (x == '+' || x == '-' || x == '*' || x == '/' || x == '^' || x == '%');
        }
        
        double calculate() {
            char x = ope.charAt(0);
            switch(x) {
                case '+': {
                    return num1 + num2;
                }
                case '-': {
                    return num1 - num2;
                }
                case '*': {
                    return num1 * num2;
                }
                case '/': {
                    return num1 / num2;
                }
                case '%': {
                    return num1 % num2;
                }
                case '^': {
                    double mu = 1;
                    for (int i = 0; i < num2; i++) {
                        mu *= num1;
                    }
                    return mu;
                }
                default: break;
            }
            return 0;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            if (Character.isDigit(s.trim().charAt(0))) {
                if (!txt.getText().trim().isEmpty()) 
                    s = txt.getText() + s; 
                txt.setText(s); 
            }
            if (s.equalsIgnoreCase("C")) {
                num1 = 0;
                num2 = 0;
                ope = "";
                txt.setText("");
            }
            if (s.equals(".")) {
                String scr = txt.getText();
                if (!scr.contains(".")) {
                    scr = scr + ".";
                    txt.setText(scr);
                }
            }
            if (isOperator(s)) {
                num1 = Double.parseDouble(txt.getText());
                ope = s;
                txt.setText("");
            }
            if (s.equals("=")) {
                num2 = Double.parseDouble(txt.getText());
                double res = calculate();
//                String scrRes = String.format("%0.1f", res);
                txt.setText(res + "");
            }
        }
        
    }
    
    
    JTextField txt;
//    String label = "1234567890+-*/%^C=";  
    String label = "C^%/789*456-123+0.=";
    JButton [] btn = new JButton[label.length()];

    public Calculator() throws HeadlessException {
        super("My Calculator");
    }
    
    public void createAndShow() {
        Container c = getContentPane();
        JPanel pnlTop, pnlBottom;
        // pnlTop is in the North
        pnlTop = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlTop.add(txt = new JTextField(25));
        txt.setEditable(false); // k cho nhap ban phim
        // pnlBottom is in Center
        pnlBottom = new JPanel();
        pnlBottom.setLayout(new GridLayout(0, 4, 5, 5));
        for (int i = 0; i < label.length(); i++) {
            btn[i] = new JButton(String.valueOf(label.charAt(i)));
            btn[i].setPreferredSize(new Dimension(40,40)); // set kich thuoc button
            btn[i].addActionListener(new ButtonHandler());
            pnlBottom.add(btn[i]);
        }
        // add pnlTop, pnlBottom to frame
        c.setLayout(new BorderLayout());
        c.add(pnlTop, BorderLayout.NORTH);
        c.add(pnlBottom, BorderLayout.CENTER);
        setVisible(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) throws Exception {
        // set Look And Feel
//        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        new Calculator().createAndShow();
    }
}

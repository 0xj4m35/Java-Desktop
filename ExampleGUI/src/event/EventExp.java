package event;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class EventExp extends JFrame 
        implements ActionListener {
    JLabel lbr=new JLabel("Ban kinh ");
    JTextField tfr=new JTextField(1);
    JLabel lbrs=new JLabel("Dien tich ");
    JTextField tfrs=new JTextField();
    JButton btnCal=new JButton("Tinh");
    JButton btnExit=new JButton("Thoat");
    public EventExp(String title){
        super(title);
        setLayout(new GridLayout(3, 2));
        add(lbr);    add(tfr);
        add(lbrs);   add(tfrs);
        btnCal.addActionListener(this);
        btnExit.addActionListener(this);
        add(btnCal); add(btnExit);
    }
    public static void main(String[] args) {
        EventExp f=new EventExp("Demo for event");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 200);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==btnCal){
            double r=Double.parseDouble(tfr.getText());
            double s=r*r*Math.PI;
            DecimalFormat f=new DecimalFormat("#.##");
            tfrs.setText(f.format(s));
        }
        else if(ae.getSource()==btnExit)
                System.exit(0);
    }    
}

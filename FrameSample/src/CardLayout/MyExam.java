/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardLayout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Nguyen Thai Bao
 */
public class MyExam extends JFrame {
    
    JButton btnNext;
    JPanel p1, p2;
    CardLayout c;
    
    public JPanel getQuestionPanel(Question q) {
        JPanel p = new JPanel(new GridLayout(0, 1));
        p.add(new JLabel(q.question));
        for (int i = 0; i < q.options.size(); i++) {
            p.add(new JCheckBox(q.options.get(i).option));
        }
        return p;
    }

    public MyExam() {
        super("My Examination");
    }
    
    public void createAndShow() {
        Container ct = getContentPane();
        ct.setLayout(new BorderLayout());
        // p1  to the North
        ct.add(p1 = new JPanel(), BorderLayout.NORTH);
        p1.setLayout(new FlowLayout());
        p1.add(btnNext = new JButton("Next"));
        // p2 to South
        ct.add(p2 = new JPanel(), BorderLayout.CENTER);
        p2.setLayout(c = new CardLayout());
        // add questions to c
        QuestionList questions = new QuestionList();
        questions.createExam();
        for (int i = 0; i < questions.questions.size(); i++) {
            p2.add(getQuestionPanel(questions.questions.get(i)));
        }
        
        // event of Button
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.next(p2); // show next ques to panel
            }
        });
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
    }
    
    public static void main(String[] args) {
        new MyExam().createAndShow();
    }
    
}

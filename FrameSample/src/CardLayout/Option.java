/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardLayout;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Thai Bao
 */
public class Option {
    
    String option;
    boolean isCorrect;

    public Option() {
    }

    public Option(String option, boolean isCorrect) {
        this.option = option;
        this.isCorrect = isCorrect;
    }
    
}

class Question {
    
    String question;
    List<Option> options;

    public Question(String question) {
        this.question = question;
        options = new ArrayList<>();
    }

    public void addOption(Option option) {
        options.add(option);
    }
    
    
}

class QuestionList {
     List<Question> questions;

    public QuestionList() {
        questions = new ArrayList<>();
    }
     
    public void createExam() {
        Question q1 = new Question("2 + 1 = ?");
        q1.addOption(new Option("3", true));
        q1.addOption(new Option("4", false));
        q1.addOption(new Option("2", false));
        q1.addOption(new Option("1", false));
        questions.add(q1);
        Question q2 = new Question("The capital of VN before 1945: ");
        q2.addOption(new Option("Ha Noi", false));
        q2.addOption(new Option("Gia Dinh", false));
        q2.addOption(new Option("Phu Xuan", true));
        q2.addOption(new Option("Dong Do", false));
        questions.add(q2);
    }
}
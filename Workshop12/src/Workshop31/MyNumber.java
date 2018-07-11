/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop31;
import java.util.ArrayList;

/**
 *
 * @author DuyDT
 */
public class MyNumber {
    boolean isNew;   
	//contains the list of entered numbers
    ArrayList<Integer> x;
    /*no need to code this method, this method is given*/
    public MyNumber() {
        x = new ArrayList<>();
    }    
    /*Append a to the end of list x*/
    public void add(int a) {
         /*Complete your code here*/
         x.add(a);
    }
    /*The below method will be called each time 
     * users finish enter values for 2 numbers,
     no need to code this method. This method is given*/
    synchronized  void notifyReceive()throws Exception {
        while(isNew) {
            wait();
        }
        isNew = true;
        notify();
    }
    /*the below method is used to calculate and display
     summation or subtraction (read the requirement in the question) 
	 of first two number in the list x*/
    synchronized  void showOuput()throws Exception {
        while(isNew == false) {
            wait();
        }
        isNew = false;
        /*
         * Your code should take first 2 numbers in the list x 
         * do the requirement in the question and output the result
        */
        int a = x.get(0);
        x.remove(0);
        int b = x.get(0);
        x.remove(0);
        System.out.println("Addition result: " + a + " + " + b + " = " + (a+b));
        
        /*inform the other thread for their task*/
        notify();
    }
}

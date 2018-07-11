/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Workshop31;
import java.util.Scanner;

/**
 *
 * @author DuyDT
 */
public class InputThread extends Thread {
    MyNumber m; 
    Scanner sc = new Scanner(System.in);
    
    /*no need to code this method*/
    public InputThread(MyNumber m) {
        this.m = m;        
    }
    @Override
    public void run() {
        try {
            while(true) {
                /*
                 * The code is used to accept 2 numbers
                 * save all of them to list x of m
                 * do not forget to notify other thread when 
                 * the task is done
                 */
                System.out.print("Enter number 1: ");
                int a = Integer.parseInt(sc.nextLine());
                m.add(a);
                System.out.print("Enter number 2: ");
                a = Integer.parseInt(sc.nextLine());
                m.add(a);
                m.notifyReceive();
                sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

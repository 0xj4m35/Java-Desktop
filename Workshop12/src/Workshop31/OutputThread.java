/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop31;

/**
 *
 * @author DuyDT
 */
public class OutputThread extends Thread {
    MyNumber m;
    /*no need to code this method*/
    public OutputThread(MyNumber m) {
        this.m = m;        
    }    
    @Override
    public void run() {
        try {
            while(true) {
                /*
                 * just simple show the output of the result 
                 * Go inside class MyNumber you will find 
                 * method use for this job
                 */
                m.showOuput();
                
                sleep(5000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}

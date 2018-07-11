
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Thai Bao
 */
public class Producer implements Runnable {
    
    MyQueue mq;
    Random rand = new Random();

    public Producer(MyQueue mq) {
        this.mq = mq;
    }

    @Override
    public void run() {
        try {
            for(int i=0; i<10; i++) {
                int x = rand.nextInt(100);
                mq.put(x);
                Thread.sleep(1000);
            }  
        }
        catch (Exception e) {
            System.out.println(e);
        }
            
    }
    
    
}

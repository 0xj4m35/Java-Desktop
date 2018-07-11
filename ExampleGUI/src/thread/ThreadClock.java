package thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;


public class ThreadClock extends Thread {
    JLabel time;
    private Object look = new Object();
    private volatile boolean paused = false;
    public ThreadClock(JLabel time){
        this.time=time;
    }
    public void run(){        
        while(true){
            work();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                
            }
        }
}
    private void work(){
        synchronized(look) {
        while(paused) {
                try {
                    look.wait();
                } catch(InterruptedException e) {
                    // nothing
                }
            }
        Date d=new Date();
        SimpleDateFormat pd=new SimpleDateFormat("hh:mm:ss");
        String sd=pd.format(d);
        time.setText(sd);
        }
    }
    public  void done() {
        paused = true;
    }
    public void restart(){
        paused = false; 
        synchronized(look) {
        look.notifyAll();
        }
    }    
}
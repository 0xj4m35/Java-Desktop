
import java.util.Random;


public class SumThread implements Runnable {

    @Override
    public void run() {
        Random rand = new Random();
        while(true) {
            try{
                int a = rand.nextInt(100);
                int b = rand.nextInt(100);
                System.out.println(a + "+" + b + "=" + (a+b));
                Thread.sleep(500);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }    
}

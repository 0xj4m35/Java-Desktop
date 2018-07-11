
import com.sun.javafx.binding.StringFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeThread implements Runnable {

    @Override
    public void run() {
        while(true) {
            try {
                Date d = new Date();
//                SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss");
//                String time = sd.format(d);
                System.out.println("Time: " + d);
                Thread.sleep(1000);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
    
    
}

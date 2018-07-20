
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class Main {
    
    public static void main(String[] args) {
        try {
            URL u = new URL("http://fap.fpt.edu.vn/Report/ViewAttendstudent.aspx?id=SE05388&campus=3&term=21&course=2873");
            System.out.println("Protocol: " + u.getProtocol());
            System.out.println("Host: " + u.getHost());
            System.out.println("Path: " + u.getPath());
            System.out.println("Query: " + u.getQuery());
            System.out.println("File: " + u.getFile());
            //read content of u
            URLConnection con = u.openConnection();
            InputStreamReader isr = new InputStreamReader(con.getInputStream());
            int c;
            while((c = isr.read()) != -1) {
                System.out.print((char)c);
            }
            isr.close();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}

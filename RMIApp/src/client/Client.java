
package client;

import business.IMethod;
import entity.Weather;
import java.rmi.Naming;

public class Client {
    
    public static void main(String[] args) {
        
        try {
            // look up service url and call remote service
            String url = "rmi://localhost:1098/MyService";
            IMethod m = (IMethod)Naming.lookup(url);
            Weather w = m.getWeatherByLocation("Hanoi");
            System.out.println("Weather.degree : " + w.getDegree());
            System.out.println("Weather.description: " + w.getDescription());
            System.out.println("toVND(125): " + m.toVND(125));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

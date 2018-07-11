
package business;

import entity.Users;
import entity.Weather;
import java.io.BufferedReader;
import java.io.FileReader;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyService extends UnicastRemoteObject implements IMethod {

    private String dataSource;
    
    
    
    final double USDVND = 22.678;
    private final double USD = 21000, EUR = 23000, INR = 15000;

    @Override
    public double convert(double amount, String currency) throws RemoteException {
        if (currency.equalsIgnoreCase("USD")) {
            return amount / USD;
        }
        if (currency. equalsIgnoreCase("EUR")) {
            return amount / EUR;
        }
        if (currency.equalsIgnoreCase("INR")) {
            return amount / INR;
        }
        return 0;
    }
 
    public MyService() throws RemoteException {
        
    }
    
    @Override
    public Weather getWeatherByLocation(String location) throws RemoteException {
        return new Weather(36, "Mostly sunny...");
    }

    @Override
    public double toVND(double USD) throws RemoteException {
        return USD*USDVND;
    }

    @Override
    public Users getUsers(String username, String password) throws RemoteException {
        Users u = null;
        // open datasource and check out if given username is in
        try {
            BufferedReader br = new BufferedReader(new FileReader(dataSource));
            String s;
            while ((s = br.readLine()) != null) {
                String[] st = s.trim().split("[/]");
                String no = st[0].trim();
                String uid = st[1].trim();
                String pwd = st[2].trim();
                String type = st[3].trim();
                if (uid.equalsIgnoreCase(username) && pwd.equals(password)) {
                    u = new Users(Integer.valueOf(no), username, type);
                    break;
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return u;
    }
    
    
    public MyService(String dataSource) throws RemoteException {
        this.dataSource = dataSource;
    }
}

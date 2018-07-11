
package business;

// can be seen by Clients

import entity.Users;
import entity.Weather;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMethod extends Remote {
    
    public Weather getWeatherByLocation(String location) throws RemoteException;
    
    public double toVND(double USD) throws RemoteException;
    
    public double convert(double amount, String currency) throws RemoteException;
    
    public Users getUsers(String username, String password) throws RemoteException;
}

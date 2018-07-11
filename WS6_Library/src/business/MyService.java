/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author Nguyen Thai Bao
 */
public class MyService extends UnicastRemoteObject implements IMethod{

    public MyService() throws RemoteException {
        
    } 
    
    @Override
    public double getIncomeTax(double num) throws RemoteException {
        double incTax = 0;
        if (num > 20000) {
            incTax += (num - 20000)*0.2;
            num = 20000;
        }
        if (num > 10000) {
            incTax += (num - 10000) * 0.15;
            num = 10000;
        }
        if (num > 5000) {
            incTax += (num - 5000) * 0.1;
        }
        return incTax;
    }
    
    
}

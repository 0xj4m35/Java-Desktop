/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Nguyen Thai Bao
 */
public interface IMethod extends Remote {
    
    public double getIncomeTax(double sal) throws RemoteException;
}

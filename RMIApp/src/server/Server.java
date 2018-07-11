/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import business.MyService;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Nguyen Thai Bao
 */
public class Server {
    
    public static void main(String[] args) {
        
        try {
            // create new service and bind to server
            MyService ms = new MyService();
            String url = "rmi://localhost:1098/MyService";
            LocateRegistry.createRegistry(1098);
            Naming.bind(url, ms);
            System.out.println("Server is ready now");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Nguyen Thai Bao
 */
public class Server {
    ServerSocket sockets;
    Socket client;
    DataInputStream dis;
    DataOutputStream dos;

    public class ServerThread extends Thread {

        public ServerThread() {
            try {
                sockets = new ServerSocket(1234);
            } catch (Exception e) {
                System.out.println(e);
            }  
        }

        @Override
        public void run() {
            try {
                client = sockets.accept();
                dis = new DataInputStream(client.getInputStream());
                dos = new DataOutputStream(client.getOutputStream());
                while(true) {
                    String num = dis.readUTF().trim();
                    if (num != null) {
                        double sal = Double.parseDouble(num);
                        send(sal);
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        public void send(double num) {
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
            try {
                dos.writeUTF(incTax + "");
            } catch (Exception e)  {
                System.out.println(e);
            }
        }
        
    }
    
    ServerThread st = null ;
    
    public Server() {
        st = new ServerThread();
        st.start();
    }
    
    public static void main(String[] args) {
        new Server();
    }
}

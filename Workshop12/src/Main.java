/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Thai Bao
 */
public class Main {
    
    public static void main(String[] args) {
        
        MyQueue mq = new MyQueue();
        
        Producer pr = new Producer(mq);
        Consumer co = new Consumer(mq);
        Thread prTh = new Thread(pr);
        Thread coTh = new Thread(co);
        
        mq.traverse();
        prTh.start();
        coTh.start();
        
    }
}

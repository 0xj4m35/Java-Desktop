/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Thai Bao
 */
public class MyQueue {
    
    Integer [] a;
    int max, n;
    boolean turn;
    
    public MyQueue() {
        max = 8;
        a = new Integer[max];
        a[0] = 1;
        a[1] = 2;
        n = 2;
        turn = true;
    }
    
    public boolean isEmpty() {
        return (n<=0) ? true : false;
    }
    
    public synchronized void put(Integer x) throws Exception {
        while (turn == false) {
            wait();
        }
        if (n > 7) {
            return;
        }
        a[n++] = x;
        System.out.println("Producer puts: " + x);
        turn = false;
        notify();
    }
    
    public synchronized Integer get() throws Exception {
        while (turn == true) { 
            wait();
        }
        if (isEmpty()) {
            return null;
        }
        Integer x = a[0];
        for (int i = 1; i < n; i++) {
            a[i-1] = a[i];
        }
        n--;
        System.out.println("--------Consumer gets: " + x);
        turn = true;
        notify();
        return x;
    }
    
    public int getSize() {
        return n;
    }
    
    public void traverse() {
        if (isEmpty()) {
            return;
        }
        System.out.print("The queue’s content:    ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d", a[i]);
        }
        System.out.println();
    }
    
}

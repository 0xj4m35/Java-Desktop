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
        TimeThread tt = new TimeThread();
        SumThread st = new SumThread();
        Thread tiTh = new Thread(tt);
        Thread suTh = new Thread(st);
        
        tiTh.start();
        suTh.start();
    }
}

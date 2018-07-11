/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balls;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Thread.sleep;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Nguyen Thai Bao
 */
class MyBall extends JPanel {
        Ball b;

        public MyBall(Ball b) {
            this.b = b;
            setSize(400, 300);
        }
        
        public void move() {
            new Thread(){
                @Override
                public void run() {
                    int dx=5, dy = 5;
                    try {
                        while(true) {
                            int x = b.x + dx;
                            int y = b.y + dy;
                            if (x + b.w >= getWidth() || x < 0) {
                                dx = -dx;
                            }
                            if (y + b.w >= getHeight() || y < 0) {
                                dy = -dy;
                            }
                            b.x = x;
                            b.y = y;
                            repaint();
                            sleep(40);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                
            }.start();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
            g.setColor(Color.red);
            g.fillOval(b.x, b.y, b.w, b.w);
        }
        
        
    }

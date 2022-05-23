/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayse
 */
public class ThreadNumber extends Thread {
    
    private final NumberGenerator ng;
    
    public ThreadNumber(NumberGenerator ng) {
        this.ng = ng;
    }
    
    @Override
    public void run() {
        callGenerator();
    }
    
    private void callGenerator() {
//        synchronized (ng) {
            for (int i = 0; i < 3; i++) {
                System.out.println(getName()    +   "   "   + ng.randomNumber());
            }
//        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayse
 */
public class ThreadHello implements Runnable {
    
    private final String name;
    
    public ThreadHello(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println(name + ": Hello");
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
            Logger.getlogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

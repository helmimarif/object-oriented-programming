/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dasar;

/**
 *
 * @author 𝔳𝔫𝔩𝔭
 */
public class Player {
    
    //definisi atribut
    String name;
    int speed;
    int HealthPoin;
    
    //definisi method run
    void run(){
        System.out.println(name + " is running...");
        System.out.println("Speed: "+ speed);
    }
    
    //definisi method is dead
    
    boolean isDead(){
        if(HealthPoin <=0) return true;
        return false;
    }
}

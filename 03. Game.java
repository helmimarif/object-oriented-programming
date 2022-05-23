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
public class Game {
    public static void main (String[] args){
        //membuat objek player
        Player Helmi = new Player();
        
        //mengisi atribut player
        Helmi.name = "Class Object";
        Helmi.speed = 78;
        Helmi.HealthPoin = 100;
        
        //menjalankan method
        Helmi.run();
        
        if(Helmi.isDead()){
            System.out.println("Game Over");
        }
    }
}

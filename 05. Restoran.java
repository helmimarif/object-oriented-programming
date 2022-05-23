/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author Ayse
 */
public class Restoran {
    //Variable (Private)
    private String menu;
    private double harga;
    private boolean spesial;
    
    //Method Setter (Public) dengan Parameter
    public void setMenu(String menu){
        this.menu = menu;
    }
    public void setharga(double harga){
        this.harga = harga;
    }
    public void setSpesial(boolean spesial){
        this.spesial = spesial;
    }
    
    //Method Getter (Public)
    public String getMenu(){
        return menu;
    }
    public double getHarga(){
        return harga;
    }
    public boolean getSpesial(){
        return spesial;
    }
    
}

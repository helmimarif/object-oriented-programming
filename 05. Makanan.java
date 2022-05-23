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
public class Makanan {
    public static void main(String[] args){
        //Membuat Instence/Objek dari Class restoran
        Restoran data = new Restoran();
    
        //Memasukkan Data pada Variable
        data.setMenu("Ayam Goreng");
        data.setharga(17000.0);
        data.setSpesial(true);
    
        //Memanggil Method Get dari Class restoran dan Menampilkannya
        System.out.println("Menu Makanan: "+data.getMenu());
        System.out.println("Harga Makanan: Rp."+data.getHarga());
        System.out.println("Menu Spesial: "+data.getSpesial());
    }
    
}

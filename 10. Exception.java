/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayse
 */
public class Exception {
    public static void main(String[] args) {
        int a[]=new int[5];
        try
        {
            a[5]=100;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Terjadi pelanggaran memory");
        }
    }
}

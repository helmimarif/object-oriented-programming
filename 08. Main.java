/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notifikasi;

/**
 *
 * @author Ayse
 */
public class Main {
    
    public static void main(String[] args){
        String emailPenerima = "my@almaata.ac.id";
        String nomerHP = "+628111111111";
        String mobileId = "android-123456";
        
        EmailNotification emailNotif = new EmailNotification();
        SMSNotification smsNotif = new SMSNotification();
        PushNotification pushNotif = new PushNotification();
        
        String message = "Polimorfisme";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHP, message);
        pushNotif.sendMessage(mobileId, message);
    }
}

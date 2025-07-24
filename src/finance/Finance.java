/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finance;

/**
 *
 * @author bayon
 */
public class Finance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Compte compte= new Compte(46789 ,56.7,"mike");
        Compte compte1= new Compte(3245 ,45.7,"edouard");
      
        System.out.println(compte);
        System.out.println(compte1);
        System.out.println(compte.id);
        
        
       
        
    }
    
}

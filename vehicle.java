/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphisme;

/**
 *
 * @author felix ryan
 */
public abstract class vehicle {
     public void function(){
         System.out.println("tool transportation");
     }
    
     public void fuel(){
         System.out.println("fuels ");
     }
     
     public abstract void walk ();
}

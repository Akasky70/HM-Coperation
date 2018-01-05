/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hm.coperation;

/**
 *
 * @author Akass
 */
public class Validate {
    
     public static Boolean checklength(String name){
        
        if(name.length()>0){
            return true;
        }else{
            return false;
        }
            
    }
    public static boolean isNumber(String n){
        try{
            Integer.parseInt(n);
            return true;
        } catch(NumberFormatException nfe){
            return false;
        }
    }
    
}

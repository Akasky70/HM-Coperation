/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hm.coperation;


import java.math.BigInteger;
   
import java.security.MessageDigest;

/**     
 * 
 *
 * @author Akass
 */
public class PasswordEncryption {
    public static String encryptPassword(String inputValue){
        String salt="admin123!@#";
        String inputValuewithsalt=inputValue+salt;
        String encryptedValue=null;
        if(null==inputValue) return null;
        
        try{
            //message digest ko object banako with the specified algorithm name
            MessageDigest digest=MessageDigest.getInstance("MD5");
            //input string ko byte representation ma rakhi digest bhitra update garxa
            //update garda kun point dekhi kun samma byte value lai line
            digest.update(inputValuewithsalt.getBytes(),0,inputValuewithsalt.length());
            //digest ma stored bhayeko byte value lai 16 digiyt hexadecimal ma convert garney
            encryptedValue=new BigInteger(1,digest.digest()).toString(16);
        }catch(Exception e){
            System.out.println("Not converted");
            
        }
        return encryptedValue;
        
    }
    
}

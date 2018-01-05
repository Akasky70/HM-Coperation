/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hm.coperation;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Akass
 */
public class DBconnection {
    public static Connection makeconnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }
        catch(Exception e){
            System.out.println("Driver not connected");
        }
        String url="jdbc:mysql://localhost:3306/HMC";
        String user="root";
        String password="";
        
        Connection con=null;
        try{
            con=DriverManager.getConnection(url,user,password);
            
        }
        catch(Exception f){
            System.out.println("Database not connected");
        }
        return con;
    
}
}
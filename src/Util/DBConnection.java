package Util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soft
 */
public class DBConnection {
    
    
     public static Connection getConnection() 
    {  
         Connection con=null;
         try {
             Class.forName("com.mysql.jdbc.Driver");
               System.out.println("loaded");
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/magsys","root","root");
              System.out.println("connected");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
         }
     
      return con; 
    }  
     

}

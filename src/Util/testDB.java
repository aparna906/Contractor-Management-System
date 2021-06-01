/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gauri
 */
public class testDB {

    public testDB() {
    }
    public static void main(String[] args) {
        Connection con = DBConnection.getConnection();
        System.out.println("DB Connected successfully !!");
    
     Statement st;
      try { 
             con=DBConnection.getConnection();
            st=con.createStatement();
            
           ResultSet rst =st.executeQuery("SELECT * FROM create_user ");
            while(rst.next()){
                int id = rst.getInt("User_Id");
                String name=rst.getString("User_Name");
                String pwd=rst.getString("Password");
                String role=rst.getString("Role");
                System.out.println("DB info:  id:" + id + ",name:"+ name + ",pwd:" + pwd + ",role:" + role);
                
            }
            
            }
      catch (SQLException ex) {
            Logger.getLogger(testDB.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}

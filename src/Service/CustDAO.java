/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.CustPojo;
import Util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author gauri
 */
public class CustDAO {
    public static  int CustSave(CustPojo c) {
		int status = 0;

		try {
			Connection con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement("insert into  customer_info values(?,?,?,?,?)");
                        ps.setInt(1,c.getId());
			ps.setString(2,c.getName());
                        ps.setString(3,c.getAddress());
                        ps.setString(4,c.getEmail());
                        ps.setString(5,c.getPhone());
			ps.executeUpdate();
              JOptionPane.showMessageDialog(null, "Customer Added Successfully");

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}
     
      public static int CustUpdate(CustPojo c)
      {  
        int status=0;  
       
        try{  
            Connection con=DBConnection.getConnection();
            
             int id =c.getId();
             String name = c.getName();
             String address=c.getAddress();
             String email=c.getEmail();
             String phone1=c.getPhone();
             
            PreparedStatement psmt = con.prepareStatement("update customer_info set Name=?, Address=?, Email=?,Phone=? where Id= " +id);
            psmt.setString(1,name);
            psmt.setString(2,address);
            psmt.setString(3, email);
            psmt.setString(4,phone1);
            status= psmt.executeUpdate();
             
               if(status!=0)
          {
              JOptionPane.showMessageDialog(null,"Customer Updated Successfully");
             
          }
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
         return status;  
      }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.SitePojo;
import Util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author gauri
 */
public class SiteDAO {
    public static  int siteSave(SitePojo s) {
		int status = 0;

		try {
			Connection con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement("insert into  site values(?,?)");
                        ps.setInt(1,s.getId());
			ps.setString(2,s.getName());
			ps.executeUpdate();
                        
              JOptionPane.showMessageDialog(null, "Site Added Successfully");

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}
    
    
     public static int siteUpdate(SitePojo s)
      {  
        int status=0;  
       
        try{  
            Connection con=DBConnection.getConnection();
             String name = s.getName();
             int id =s.getId();
              PreparedStatement psmt = con.prepareStatement("update site set site_Name=? where site_id="+id);
            psmt.setString(1,name);
            status= psmt.executeUpdate();
             
               if(status!=0)
          {
              JOptionPane.showMessageDialog(null,"Site Updated Successfully");
             
          }
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
         return status;  
      }

}

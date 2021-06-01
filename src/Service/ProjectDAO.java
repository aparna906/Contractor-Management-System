/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.ProjectPojo;
import Util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author gauri
 */
public class ProjectDAO {
   public static  int projectSave(ProjectPojo p) {
		int status = 0;

		try {
			Connection con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement("insert into  project_info values(?,?,)");
                        ps.setInt(1,p.getId());
			ps.setString(2,p.getName());
                        
                        
			ps.executeUpdate();
              JOptionPane.showMessageDialog(null, "project Added Successfully");

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}
   
    public static int projectUpdate(ProjectPojo p)
      {  
        int status=0;  
       
        try{  
            Connection con=DBConnection.getConnection();
             String name = p.getName();
             int id =p.getId();
              PreparedStatement psmt = con.prepareStatement("update project_info set P_Name=? where P_id="+id);
            psmt.setString(1,name);
            status= psmt.executeUpdate();
             
               if(status!=0)
          {
              JOptionPane.showMessageDialog(null,"project Updated Successfully");
             
          }
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
         return status;  
      }
 
}

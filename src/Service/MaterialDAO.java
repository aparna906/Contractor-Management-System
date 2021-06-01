/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.MaterialPojo;
import Util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author gauri
 */
public class MaterialDAO {
    public static  int MaterialSave(MaterialPojo m) {
		int status = 0;

		try {
			Connection con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement("insert into  material_info values(?,?)");
                        ps.setInt(1,m.getId());
			ps.setString(2,m.getName());
			ps.executeUpdate();
              JOptionPane.showMessageDialog(null, "Material Added Successfully");

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}
    
     public static int materialUpdate(MaterialPojo s)
      {  
        int status=0;  
       
        try{  
            Connection con=DBConnection.getConnection();
             String name = s.getName();
             int id =s.getId();
              PreparedStatement psmt = con.prepareStatement("update material_info set M_Name=? where M_id="+id);
            psmt.setString(1,name);
            status= psmt.executeUpdate();
             
               if(status!=0)
          {
              JOptionPane.showMessageDialog(null,"Material Updated Successfully");
             
          }
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
         return status;  
      }

}

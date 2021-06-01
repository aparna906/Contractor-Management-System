/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.VehiclePojo;
import Util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author gauri
 */
public class VehicleDAO {
     public static  int vehicleSave(VehiclePojo v) {
		int status = 0;

		try {
			Connection con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement("insert into  vehicle_info values(?,?,?)");
                        ps.setInt(1,v.getId());
			ps.setString(2,v.getType());
                        ps.setString(3,v.getNumber());
			ps.executeUpdate();
              JOptionPane.showMessageDialog(null, "Vehicle Added Successfully");

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}
     
      public static int vehicleUpdate(VehiclePojo v)
      {  
        int status=0;  
       
        try{  
            Connection con=DBConnection.getConnection();
            int Id =v.getId();
            String Type =v.getType();
            String Number=v.getNumber();
              PreparedStatement psmt = con.prepareStatement("update vehicle_info set Type=?,Number=? where Id="+Id);
            psmt.setString(1,Type);
            psmt.setString(2, Number);
            status= psmt.executeUpdate();
             
               if(status!=0)
          {
              JOptionPane.showMessageDialog(null,"Vehicle Updated Successfully");
             
          }
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
         return status;  
      }


}

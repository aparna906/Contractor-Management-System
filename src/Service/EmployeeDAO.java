/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.EmployeePojo;
import Util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author gauri
 */
public class EmployeeDAO {
     public static  int EmployeeSave(EmployeePojo e) {
		int status = 0;

		try {
			Connection con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement("insert into  employee_info values(?,?,?,?,?)");
                        ps.setInt(1,e.getId());
			ps.setString(2,e.getName());
                        ps.setString(3,e.getAddress());
                        ps.setString(4,e.getEmail());
                        ps.setInt(5,e.getPhone());
			ps.executeUpdate();
              JOptionPane.showMessageDialog(null, "Employee Added Successfully");

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}
     
      public static int employeeUpdate(EmployeePojo e)
      {  
        int status=0;  
       
        try{  
            Connection con=DBConnection.getConnection();
            
             int id =e.getId();
             String name = e.getName();
             String address=e.getAddress();
             String email=e.getEmail();
             int phone1=e.getPhone();
                                                       
            PreparedStatement psmt = con.prepareStatement("update employee_info set E_Name=?, E_Address=?, E_email=?,E_Phone=? where E_id= " +id ) ;
            psmt.setString(1,name);
            psmt.setString(2,address);
            psmt.setString(3, email);
            psmt.setInt(4,phone1);
            status= psmt.executeUpdate();
             
               if(status!=0)
          {
              JOptionPane.showMessageDialog(null,"Employee Updated Successfully");
             
          }
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
         return status;  
      }

}


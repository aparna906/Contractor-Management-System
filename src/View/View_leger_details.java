/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Util.DBConnection;
import java.sql.Connection;
import static java.sql.JDBCType.DATE;
import java.sql.ResultSet;
import java.sql.*;
import java.text.SimpleDateFormat;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gauri
 */
public class View_leger_details extends javax.swing.JPanel {

    Connection con=null;
    Statement st;
    DefaultTableModel mod1,mod2;
    public View_leger_details( String id) {
        initComponents();
        cid1.setText(id);
        mod1 = (DefaultTableModel)jTable1.getModel();
        mod2=(DefaultTableModel)jTable2.getModel();
        try{
            
          con = DBConnection.getConnection();
          st =con.createStatement();
        
         ResultSet rst= st.executeQuery("select * from material_info");
           
          
           Object ob[] = new Object[2];
           while(rst.next()){
               
                  ob[0]=rst.getString("M_Id");   
                  ob[1]=rst.getString("M_Name");
                 // name.add(rst.getString("M_Name"));
                   mod1.addRow(ob);
                 }
           
           if(mod1.getRowCount()>0)
        {
            for(int k=mod1.getRowCount()-1;k>-1;k--)
            {
                mod1.setValueAt(""+0.0,k,2);
            }
        }
           ResultSet rst1= st.executeQuery("select * from contract_material_info where contract_id = '"+id+"'");

            int no=0;

            while(rst1.next())
            {
                Float rate=rst1.getFloat("rate");
                mod1.setValueAt(""+rate,no,2);
                no++;
            } 
           
           }
        catch(Exception e)
        {
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cid1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fromdate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        todate = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setText("View Ledger Details");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 380, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\gauri\\OneDrive\\Pictures\\Camera Roll\\1011.jpg")); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 140));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 1260, 80));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("cid");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 60, 40));

        cid1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel3.add(cid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 80, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date from");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 170, 40));

        fromdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(fromdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 180, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("To");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 40, 40));

        todate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(todate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 210, 40));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 170, 40));

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Vehicle No", "Material", "Quantity", "Fuel left ", "No. of trips", "Milage", "Fuel filled", "Distance in single trip"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 870, 520));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Material Rate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setText("Save Contract");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 170, 40));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "s/no", "Material Name", "Rate"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 480));

        jButton3.setBackground(new java.awt.Color(0, 153, 204));
        jButton3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 30, 20));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, 340, 510));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 1260, 640));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 1440, 820));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
  

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        // mod1.getDataVector().removeAllElements();

        if(mod1.getRowCount()>0)
        {
            for(int k=mod1.getRowCount()-1;k>-1;k--)
            {
                mod1.setValueAt(""+0.0,k,2);
            }
        }

        try{
            String id =cid1.getText();
            con = DBConnection.getConnection();
            st =con.createStatement();
            //material

            ResultSet rst= st.executeQuery("select * from contract_material_info where contract_id = '"+id+"'");

            int no=0;

            while(rst.next())
            {
                Float rate=rst.getFloat("rate");
                mod1.setValueAt(""+rate,no,2);
                no++;
            }
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_jButton3ActionPerformed

     public String getName(int id){
     String name ="";
        try{

            con = DBConnection.getConnection();
            Statement st =con.createStatement();

            ResultSet rs3=st.executeQuery("Select M_Name  from material_info where M_Id=" +id);
            while(rs3.next())
            {
               name = ""+rs3.getString("M_Name");
               
            }
        }
        catch(Exception e)
        {

        } 
        
       return name; 
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int id =Integer.parseInt(cid1.getText());
          if(mod2.getRowCount()>0)
            {
                for(int k=mod2.getRowCount()-1;k>-1;k--)
                {
                    mod2.removeRow(k);
                }
            }
          
            java.util.Date fromDate = fromdate.getDate();
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
            String from = format2.format(fromDate);
            java.util.Date toDate = todate.getDate();
            format2 = new SimpleDateFormat("yyyy-MM-dd");
            String to = format2.format(toDate);
    
         try{
             
               con =DBConnection.getConnection();
        Statement stmt=con.createStatement();
        StringBuilder sb = new StringBuilder(14);
        
            sb.append("and contract_id ="+id);
                     
        ResultSet rs1=stmt.executeQuery("Select * from con_leg_vehicle where date between '" + from + "' and '" + to + "' "+sb+"" );
             double mrate = 0.0;
        while(rs1.next()){
         
           int id1=rs1.getInt("contract_id");
           String vehicle_no=rs1.getString("vehicle_no");
           String material =rs1.getString("material");
           String quantity =rs1.getString("quantity");
           String fuel_left =rs1.getString("fuel_left");  
           String trips =rs1.getString("trips");
           String milage =rs1.getString("milage");
           String fuelFilled =rs1.getString("fuelFilled");
           String distanceInSingleTrip =rs1.getString("distanceInSingleTrip");
           Date date =rs1.getDate("date");
           
           String mname = getName(Integer.parseInt(material));
        /* ResultSet rst=stmt.executeQuery("SELECT c.contract_id,m.M_Id,c.rate,m.M_Name FROM magsys.material_info m  join magsys.contract_material_info c on c.material_id=m.M_Id where c.contract_id=1 and m.M_Name='Concrete'");

           while(rst.next()){
           mrate = rst.getDouble("c.rate");
           } */
          
           mod2.insertRow(mod2.getRowCount(),new  String []{""+id1,""+vehicle_no,""+mname,""+quantity,""+fuel_left,
      ""+trips, ""+milage,""+fuelFilled,""+distanceInSingleTrip});
        }
        }
        catch(Exception e){
            
        }         
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cid1;
    private com.toedter.calendar.JDateChooser fromdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTable jTable2;
    private com.toedter.calendar.JDateChooser todate;
    // End of variables declaration//GEN-END:variables
}

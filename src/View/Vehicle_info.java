/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.SitePojo;
import Model.VehiclePojo;
import Service.SiteDAO;
import Service.VehicleDAO;
import Util.DBConnection;
import static View.Site_info.id;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author gauri
 */
public class Vehicle_info extends javax.swing.JPanel {
  
     HomePage hp;
     Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
    /**
     * Creates new form Vehicle_info
     */
     DefaultTableModel mod;
    Connection con=null;
    
    public Vehicle_info() {
        initComponents();
        
        mod = (DefaultTableModel)jTable.getModel();
        jButton2.setEnabled(false);   
        
        try{
            
          con = DBConnection.getConnection();
          Statement st =con.createStatement();
          Object ob[] = new Object[4];
          
          ResultSet rs2=st.executeQuery("Select * from vehicle_info");
          while(rs2.next())
          {
                ob[0]=rs2.getInt("Id");
                ob[1]=rs2.getString("Type");
                ob[2]=rs2.getString("Number");
                mod.addRow(ob);
          }
        }
        catch(Exception e)
        {
            
        }
         System.out.println(id); 
        
    }

 
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        typeV = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Type", "Number"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 520, 510));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 550, 550));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 110, 50));

        id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel5.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 360, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 100, 50));

        typeV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        typeV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulldozers", "Loaders", "Dump Trucks", "Trenchers", "Backhoes", "Compactors", "Forklifts", "Concrete Mixer Truck" }));
        typeV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeVActionPerformed(evt);
            }
        });
        jPanel5.add(typeV, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 360, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Number");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, 50));

        number.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });
        jPanel5.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 360, 50));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 120, 50));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 140, 50));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 510, 550));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Vehicle Information");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 530, 70));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 910, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\gauri\\OneDrive\\Pictures\\Camera Roll\\vehi223.jpg")); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 150, 110));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 1190, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1976, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void typeVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeVActionPerformed
        // TODO add your handling code here:
          String Type=(typeV.getSelectedItem().toString());
          try{

            con = DBConnection.getConnection();
            Statement st =con.createStatement();

            ResultSet rs4=st.executeQuery("Select * from vehicle_info where Type='"+Type+"'");
            while(rs4.next())
            {
                id.setText(rs4.getString("id"));
                number.setText(rs4.getString("number"));
                
            }
        }
        catch(Exception e)
        {

        }

    }//GEN-LAST:event_typeVActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_numberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     VehiclePojo vp = new VehiclePojo();
        int id1 = Integer.parseInt(id.getText());
        vp.setId(id1);
       String typeName = typeV.getSelectedItem().toString();
        vp.setType(typeName);
         vp.setNumber(number.getText());
       VehicleDAO.vehicleSave(vp);
       mod.insertRow(mod.getRowCount(),new  String []{""+id1,""+typeV.getSelectedItem(),""+number.getText()});
         
         // clear data
         id.setText("");
         typeV.setSelectedItem("");
         number.setText("");
 
     
        {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VehiclePojo vp = new VehiclePojo();
        int Id1 = Integer.parseInt(id.getText());
        vp.setId(Id1);
        vp.setType(typeV.getItemAt(Id1));
        vp.setNumber(number.getText());
     
          VehicleDAO.vehicleUpdate(vp);
        int i = jTable.getSelectedRow();
         if(i>=0)
          {
              mod.setValueAt(id.getText(), i,0);
              mod.setValueAt(typeV.getSelectedItem(), i, 1);
              mod.setValueAt(number.getText(), i, 2);
          }
         // clear data
         id.setText("");
         typeV.setSelectedItem("");
         number.setText("");
         jButton1.setEnabled(true);
         jButton2.setEnabled(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        int i=jTable.getSelectedRow();
        TableModel service_table =jTable.getModel();
        id.setText(service_table.getValueAt(i,0).toString());
        typeV.setSelectedItem(service_table.getValueAt(i,1).toString());
        number.setText(service_table.getValueAt(i, 2).toString());
    }//GEN-LAST:event_jTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField number;
    private javax.swing.JComboBox<String> typeV;
    // End of variables declaration//GEN-END:variables

}
package View;

import Model.SitePojo;
import Service.SiteDAO;
import Util.DBConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gauri
 */
public class Site_info extends javax.swing.JPanel {

    /**
     * Creates new form Site_info
     */
    DefaultTableModel mod;
    Connection con=null;
    
    public Site_info() {
        initComponents();
        mod = (DefaultTableModel)Table.getModel();
        jButton2.setEnabled(false);  
        
        try{
            
          con = DBConnection.getConnection();
          Statement st =con.createStatement();
          Object ob[] = new Object[2];
          
          ResultSet rs2=st.executeQuery("Select * from site");
          while(rs2.next())
          {
                ob[0]=rs2.getInt("site_id");
                ob[1]=rs2.getString("site_Name");
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

        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setForeground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(60, 40, 80, 60);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(60, 170, 80, 50);

        id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel3.add(id);
        id.setBounds(60, 100, 330, 50);

        name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel3.add(name);
        name.setBounds(60, 220, 330, 50);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("SAVE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButton1PropertyChange(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(100, 310, 120, 50);

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(240, 310, 130, 50);

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 480, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Site Information");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 370, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\gauri\\OneDrive\\Pictures\\Camera Roll\\ee100.jpg")); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 100));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 1010, 100));

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(0).setPreferredWidth(2);
            Table.getColumnModel().getColumn(0).setHeaderValue("Id");
            Table.getColumnModel().getColumn(1).setHeaderValue("Name");
        }

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 470, 570));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 530, 600));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 1200, 850));
        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SitePojo sp = new SitePojo();
        int id1 = Integer.parseInt(id.getText());
        sp.setId(id1);
        sp.setName(name.getText());
     
        SiteDAO.siteUpdate(sp);
        int i = Table.getSelectedRow();
         if(i>=0)
          {
              mod.setValueAt(id.getText(), i,0);
              mod.setValueAt(name.getText(), i, 1);
          }
         // clear data
         id.setText("");
         name.setText("");
         jButton1.setEnabled(true);
         jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        SitePojo sp = new SitePojo();
        int id1 = Integer.parseInt(id.getText());
        sp.setId(id1);
        sp.setName(name.getText());
        SiteDAO.siteSave(sp);
        mod.insertRow(mod.getRowCount(),new  String []{""+id1,""+name.getText()});
         
         // clear data
         id.setText("");
         name.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        int i=Table.getSelectedRow();
        TableModel service_table =Table.getModel();
        id.setText(service_table.getValueAt(i,0).toString());
        name.setText(service_table.getValueAt(i,1).toString());
    }//GEN-LAST:event_TableMouseClicked

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButton1PropertyChange
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton1PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    public static javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}

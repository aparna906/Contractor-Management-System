package View;

import Util.DBConnection;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gauri
 */
public class Contract_info extends javax.swing.JPanel {

    /**
     * Creates new form Create_user
     */
    Connection con=null;
    Statement st;
     DefaultTableModel mod1,mod2,mod3;
    JTable service_table;
    private JScrollPane scrollpane;
    DefaultListModel info1 =new DefaultListModel();
    
        public Contract_info() {
        initComponents();
         JTableHeader jh =jTable1.getTableHeader();
         jh.setFont(new Font("plain",Font.BOLD,14));
         jh.setBackground(Color.PINK);
         
         
         mod1 = (DefaultTableModel)jTable1.getModel();
         
         try{
            
          con = DBConnection.getConnection();
          st =con.createStatement();
         
          //site
          ResultSet rs1=st.executeQuery("Select site_Name from site");
          ArrayList<String>site  = new ArrayList<String>();
           while(rs1.next()){
             site.add(rs1.getString("site_Name"));
            }  
                 
           for(int x=0;x<site.size();x++)
            {
               siteCombo.addItem(site.get(x));
           }
           
           //Project
          ResultSet rs2=st.executeQuery("Select P_Name from project_info");
          ArrayList<String>project  = new ArrayList<String>();
           while(rs2.next()){
             project.add(rs2.getString("P_Name"));
            }  
                 
           for(int x=0;x<project.size();x++)
            {
               projectCombo.addItem(project.get(x));
           }
           
           
           //Name
           ResultSet rs3=st.executeQuery("Select Name from customer_info");
           ArrayList<String>customer  = new ArrayList<String>();
            while(rs3.next()){
             namecombo.addItem(rs3.getString("Name"));
            }  
            
           
            
           //material 
           
           ResultSet rst= st.executeQuery("select * from material_info");
           
          
           Object ob[] = new Object[2];
           while(rst.next()){
               
                  ob[0]=rst.getString("M_Id");   
                  ob[1]=rst.getString("M_Name");
                 // name.add(rst.getString("M_Name"));
                   mod1.addRow(ob);
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

        jCalendarBeanInfo1 = new com.toedter.calendar.JCalendarBeanInfo();
        jMonthChooserBeanInfo1 = new com.toedter.calendar.JMonthChooserBeanInfo();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        projectCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        siteCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        namecombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Adress = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Contract Id");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 140, 40));

        idNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel5.add(idNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 170, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Project");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 110, 40));

        projectCombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        projectCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectComboActionPerformed(evt);
            }
        });
        jPanel5.add(projectCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 170, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Site");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 60, 40));

        siteCombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        siteCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteComboActionPerformed(evt);
            }
        });
        jPanel5.add(siteCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 190, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 80, 40));

        phoneText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel5.add(phoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 190, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 70, 40));

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 190, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Name");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, 40));

        namecombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        namecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namecomboActionPerformed(evt);
            }
        });
        jPanel5.add(namecombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 170, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 90, 40));

        Adress.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel5.add(Adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 190, 40));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Material Quantity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 520, 240));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 560, 280));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 0));
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 100, 50));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 0));
        jButton3.setText("View ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, 100, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1010, 570));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setText("Contract Information");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(140, 30, 410, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\gauri\\OneDrive\\Pictures\\Camera Roll\\contractim1.jpg")); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(jLabel10);
        jLabel10.setBounds(0, 0, 130, 110);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 110));

        jPanel3.add(jPanel1);
        jPanel1.setBounds(90, 40, 1010, 680);

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 1180, 780));
    }// </editor-fold>//GEN-END:initComponents

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
         String id =idNo.getText();
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        try {
          Connection con = DBConnection.getConnection();
              int cid =Integer.parseInt(idNo.getText());
              String custname = namecombo.getSelectedItem().toString();
              int phone =Integer.parseInt(phoneText.getText());
              String address = Adress.getText();
              String proname = projectCombo.getSelectedItem().toString();
              String sitename = siteCombo.getSelectedItem().toString();
     
              PreparedStatement ps1 = con.prepareStatement("insert into contract_info values(?,?,?,?,?,?)");
              ps1.setInt(1, cid);
              ps1.setString(2,custname );
              ps1.setInt(3,phone);
              ps1.setString(4,address );
              ps1.setString(5,proname );
              ps1.setString(6,sitename );
             
                ps1.executeUpdate();
                
                
        //Matrial rate save againt contarct ID
        for(int i=0; i< mod1.getRowCount();i++)
        {

           
            String mid =mod1.getValueAt(i,0).toString();
            Float mrate = Float.parseFloat(mod1.getValueAt(i,2).toString());
            
               
                PreparedStatement ps = con.prepareStatement("insert into  contract_material_info values(?,?,?)");
                ps.setInt(1,cid);
                ps.setString(2,mid);
                ps.setFloat(3,mrate);

                ps.executeUpdate();

              
          
            }
         
          } catch (Exception ex) {
                ex.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Contarct Added Successfully");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void namecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namecomboActionPerformed
        // TODO add your handling code here:
        String Name=(namecombo.getSelectedItem().toString());
        try{

            con = DBConnection.getConnection();
            Statement st =con.createStatement();

            ResultSet rs3=st.executeQuery("Select * from customer_info where Name='"+Name+"'");
            while(rs3.next())
            {
               
                phoneText.setText(rs3.getString("Phone"));
                Adress.setText(rs3.getString("Address"));
            }
        }
        catch(Exception e)
        {

        }

    }//GEN-LAST:event_namecomboActionPerformed

    private void projectComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectComboActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_projectComboActionPerformed

    private void siteComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siteComboActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Adress;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField idNo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendarBeanInfo jCalendarBeanInfo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JMonthChooserBeanInfo jMonthChooserBeanInfo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> namecombo;
    private javax.swing.JTextField phoneText;
    private javax.swing.JComboBox<String> projectCombo;
    private javax.swing.JComboBox<String> siteCombo;
    // End of variables declaration//GEN-END:variables
}

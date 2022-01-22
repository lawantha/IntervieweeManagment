/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import DataBase.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class PWreset extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pat = null;
    ResultSet rs = null;
    
    public PWreset() {
        initComponents();
        conn = DBconnect.connect();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("cvman?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        dataQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM Data d");
        dataList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : dataQuery.getResultList();
        dataQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM Data d");
        dataList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : dataQuery1.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboUsers = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pwf = new javax.swing.JPasswordField();
        cpwf = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(815, 521));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(799, 30));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reset Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLabel1)
                .addContainerGap(302, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("User Name");

        comboUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Officer1", "Officer2", "Interviewer", "Admin" }));

        jLabel4.setText("Current PassWord");

        jLabel5.setText("New PassWord");

        clear.setBackground(new java.awt.Color(255, 153, 153));
        clear.setText("Clear");
        clear.setBorder(null);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(153, 255, 153));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel2.setText("Confirm New PW");

        pwf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwfKeyReleased(evt);
            }
        });

        cpwf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpwfKeyReleased(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(update))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboUsers, 0, 184, Short.MAX_VALUE)
                            .addComponent(cp)
                            .addComponent(pwf)
                            .addComponent(cpwf))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pwf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpwf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update))
                .addContainerGap(1159, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String un = comboUsers.getSelectedItem().toString();
        String crpw =cp.getText();
        String pw =pwf.getText();
        String cpw =cpwf.getText();
        try{
            String qry = "Select pw from users where user='"+un+"'";
            pat = conn.prepareStatement(qry);
            rs=pat.executeQuery();
            if(rs.next()){
            String pwwww = rs.getString("pw");
            
            if(pwwww.equals(crpw)){
                if(pw.length()==8){
                    if (pw.equals(cpw)) {
                        String qry1 = "UPDATE users SET pw='"+pw+"' WHERE user='"+un+"'";
                        pat = conn.prepareStatement(qry1);
                        pat.execute();
                        JOptionPane.showMessageDialog(null, "Done!");
                    }
                }
            }}
            else{
                JOptionPane.showMessageDialog(null, "Invalied Password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PWreset.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void cpwfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpwfKeyReleased
        // TODO add your handling code here:
        String pw =pwf.getText();
        String cpw =cpwf.getText();
        if (!cpw.equals(pw)) {
            jLabel6.setText("Invalid");
        } else {
            jLabel6.setText("");
        }
    }//GEN-LAST:event_cpwfKeyReleased

    private void pwfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwfKeyReleased
        // TODO add your handling code here:
        if (pwf.getText().length() < 8 || pwf.getText().length() > 8) {
            jLabel7.setText("Invalid");
        } else {
            jLabel7.setText("");
        }
    }//GEN-LAST:event_pwfKeyReleased

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        cp.setText("");
        cpwf.setText("");
        pwf.setText("");
    }//GEN-LAST:event_clearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> comboUsers;
    private javax.swing.JTextField cp;
    private javax.swing.JPasswordField cpwf;
    private java.util.List<Interface.Data> dataList;
    private java.util.List<Interface.Data> dataList1;
    private javax.persistence.Query dataQuery;
    private javax.persistence.Query dataQuery1;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pwf;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
private String status;
}

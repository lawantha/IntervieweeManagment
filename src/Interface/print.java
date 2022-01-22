/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import DataBase.DBconnect;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import Interface.View_All;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class print extends javax.swing.JFrame {

    /**
     * Creates new form print
     */
    Connection conn = null;
    PreparedStatement pat = null;
    ResultSet rs = null;
    String nm,id,bir,ad,em,ph,ot,ag,al,dp,dg,gd;
    public print(){
        
    }
    public print(String para) {
        setResizable(false);
        initComponents();
        conn = DBconnect.connect();
        getting(para);
        display();
    }
    
    public void getting(String para){
        String qry = "Select * from data where NIC = '" + para + "' ";
        try {
            pat = conn.prepareStatement(qry);
            rs = pat.executeQuery();
            while(rs.next()){
                nm=rs.getString("Name");
                ag=rs.getString("Age");
                id=rs.getString("NIC");
                ad=rs.getString("Address");
                ph=rs.getString("Phone");
                em=rs.getString("Email");
                gd=rs.getString("Gender");
                al=rs.getString("AL");
                dp=rs.getString("Diploma");
                dg=rs.getString("Degree");
                ot=rs.getString("Other");
                bir=rs.getString("DOB");
            }
           } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void display(){
        jTextArea1.append("\n\n\t\t...............CV............. \n\n"
                +"\t*********************************************************\n\n\n"
                +"\tName  \t:  "+nm
                +"\n\n\n\tNIC  \t:  "+id
                +"\n\n\n\tDate of Birth  \t:  "+bir
                +"\n\n\n\tAge  \t:  "+ag
                +"\n\n\n\tAddress  \t:  "+ad
                +"\n\n\n\tEmail  \t:  "+em
                +"\n\n\n\tPhone  \t:  "+ph
                +"\n\n\n\tGender  \t:  "+gd
                +"\n\n\n\tA/L  \t:  "+al
                +"\n\n\n\tDiploma  \t:  "+dp
                +"\n\n\n\tDegree  \t:  "+dg
                +"\n\n\n\tOther Qualifications  \t:  "+ot
                +"\n\n\n\t");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        printBTN = new javax.swing.JButton();
        back = new javax.swing.JButton();
        PDF = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 60));

        printBTN.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        printBTN.setText("Print");
        printBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBTNActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        back.setText("Cancel");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        PDF.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        PDF.setText("Creat PDF");
        PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(PDF)
                .addGap(26, 26, 26)
                .addComponent(printBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(printBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(PDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void printBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBTNActionPerformed
        try {
            // TODO add your handling code here:
            jTextArea1.print();
            View_All pt = new View_All();
            pt.setVisible(true);
            this.dispose();
        } catch (PrinterException ex) {
            Logger.getLogger(print.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_printBTNActionPerformed

    private void PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFActionPerformed
        // TODO add your handling code here:
        String s =jTextArea1.getText();
        PdfPTable tbl=new PdfPTable(1);
        tbl.addCell(s);
            String path="";
            JFileChooser j= new JFileChooser();
            j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int x=j.showSaveDialog(this);
            
            if(x==JFileChooser.APPROVE_OPTION){
                path = j.getSelectedFile().getPath();
            }
            Document dcc = new Document();
        try {
                PdfWriter.getInstance(dcc,new FileOutputStream(path+nm+".pdf"));
                    dcc.open();
                    dcc.add(tbl);
                    dcc.close();
                JOptionPane.showMessageDialog(null, "Succsessful");
                View_All pt = new View_All();
                pt.setVisible(true);
                this.dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(print.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(print.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PDFActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        View_All pt = new View_All();
        pt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new print().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PDF;
    private javax.swing.JButton back;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton printBTN;
    // End of variables declaration//GEN-END:variables
}

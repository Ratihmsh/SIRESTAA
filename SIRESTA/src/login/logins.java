/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi.conek;

/**
 *
 * @author ASUS
 */
public class logins extends javax.swing.JFrame {

    /**
     * Creates new form logins
     */
    public logins() {
        initComponents();
        txtnip.setBackground(new Color(0,0,0,0));
        txtnip.setBorder(null);
        txtpass.setBackground(new Color(0,0,0,0));
        txtpass.setBorder(null);
        btnlogin.setBackground(new Color(0,0,0,0));
        btnlogin.setBorder(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnip = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnip.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtnip.setForeground(new java.awt.Color(0, 0, 102));
        txtnip.setBorder(null);
        getContentPane().add(txtnip, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 380, -1));

        txtpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtpass.setForeground(new java.awt.Color(0, 0, 102));
        txtpass.setBorder(null);
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 380, -1));

        btnlogin.setBorder(null);
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 460, 140, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/LOG IN FIX resize.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        try{
            Statement statement=(Statement)conek.GetConnection().createStatement();
          
            String sql = "SELECT * FROM admin WHERE nip ='" + txtnip.getText() +"' and password ='" + txtpass.getText() +"'";
            ResultSet res=statement.executeQuery(sql);
            
            if(res.next()){
                JOptionPane.showMessageDialog(null, "Login Berhasil");
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "nip atau password salah");
                txtpass.requestFocus();
            }
        }catch(SQLException e){
            System.out.println("Error");
        }
    }//GEN-LAST:event_btnloginActionPerformed

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
            java.util.logging.Logger.getLogger(logins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtnip;
    private javax.swing.JTextField txtpass;
    // End of variables declaration//GEN-END:variables
}

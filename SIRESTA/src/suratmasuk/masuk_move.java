/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package suratmasuk;

import java.sql.Statement;
import java.sql.Time;
import javax.swing.JOptionPane;
import koneksi.conek;

/**
 *
 * @author WIN 10
 */
public class masuk_move extends javax.swing.JFrame {

    /**
     * Creates new form masuk_move
     */
    public masuk_move() {
        initComponents();
        txtdirektori.setEditable(false);

    }

    void setDirektori(String direktoriSurat){
        //String direktorisurat = null;
        txtdirektori.setText(direktoriSurat);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser3 = new com.raven.datechooser.DateChooser();
        txtkegiatan = new javax.swing.JTextField();
        txttanggal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtdirektori = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        txtwaktu = new com.github.lgooddatepicker.components.TimePicker();

        dateChooser3.setDateFormat("yyyy-MM-dd");
        dateChooser3.setTextRefernce(txttanggal);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtkegiatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 53, 200, -1));
        getContentPane().add(txttanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 87, 200, -1));

        jLabel1.setText("Nama Kegiatan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 56, -1, -1));

        jLabel2.setText("Tanggal Kegiatan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 90, -1, -1));

        jLabel3.setText("Waktu");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 124, -1, -1));
        getContentPane().add(txtdirektori, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 187, 319, -1));

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));
        getContentPane().add(txtwaktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
                                       
    String kegiatan = txtkegiatan.getText();
    String tanggal = txttanggal.getText();
    String waktu = txtwaktu.getText();
    String direktori = txtdirektori.getText();
    try {
        Statement statement = (Statement) conek.GetConnection().createStatement();
        // Perintah SQL untuk memasukkan data ke dalam tabel kegiatan
        String sql = "INSERT INTO kegiatan (date, kegiatan, surat, waktu) VALUES "
                + "('" + tanggal + "','" + kegiatan + "','" + direktori + "','" + waktu + "')";
        // Jalankan perintah SQL
        statement.executeUpdate(sql);
        // Beri pesan bahwa data telah disimpan
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
    } catch (Exception e) {
        // Tangani jika terjadi kesalahan
        JOptionPane.showMessageDialog(null, "Gagal menyimpan data: " + e.getMessage());
    }
    }//GEN-LAST:event_btnsaveActionPerformed

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
            java.util.logging.Logger.getLogger(masuk_move.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(masuk_move.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(masuk_move.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(masuk_move.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new masuk_move().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsave;
    private com.raven.datechooser.DateChooser dateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtdirektori;
    private javax.swing.JTextField txtkegiatan;
    private javax.swing.JTextField txttanggal;
    private com.github.lgooddatepicker.components.TimePicker txtwaktu;
    // End of variables declaration//GEN-END:variables
}

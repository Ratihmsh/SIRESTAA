    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kegiatan;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import jdk.javadoc.internal.tool.Main;
import koneksi.conek;

/**
 *
 * @author WIN 10
 */
public class kegiatan extends javax.swing.JFrame {
     

    /**
     * Creates new form kalender
     */

    public kegiatan() {
       initComponents();
       datatable();
       reset();
       tglcari.setBackground(new Color(0,0,0,0));
       tglcari.setBorder(null);
       
    }
    public void reset(){
        txtkegiatan.setText("");
        txtwaktu.setText("");
        }
        public void datatable(){
        
        DefaultTableModel tbl=new DefaultTableModel();
        tbl.addColumn("date");  
        tbl.addColumn("kegiatan");
        tbl.addColumn("surat");
        tbl.addColumn("waktu");
       
        table.setModel(tbl);
        try{
            Statement statement=(Statement)conek.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("SELECT * from kegiatan ");
            while(res.next())
            {
                tbl.addRow(new Object[]{
                    res.getString("date"),
                    res.getString("kegiatan"),
                    res.getString("Surat"),
                    res.getString("waktu")
                    
            });
                table.setModel(tbl);
            }
        }catch (Exception e){
                JOptionPane.showMessageDialog(rootPane, "salah "+e);
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

        dateChooser3 = new com.raven.datechooser.DateChooser();
        txttgl = new javax.swing.JTextField();
        txtkegiatan = new javax.swing.JTextField();
        badd = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        tglcari = new javax.swing.JTextField();
        bsearch = new javax.swing.JLabel();
        bdelete = new javax.swing.JLabel();
        bedit = new javax.swing.JLabel();
        txtsurat = new javax.swing.JTextField();
        txtwaktu = new com.github.lgooddatepicker.components.TimePicker();
        cover = new javax.swing.JLabel();

        dateChooser3.setDateFormat("yyyy-MM-dd");
        dateChooser3.setTextRefernce(txttgl);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttglActionPerformed(evt);
            }
        });
        getContentPane().add(txttgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 170, -1));
        getContentPane().add(txtkegiatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 170, -1));

        badd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        badd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                baddMouseClicked(evt);
            }
        });
        getContentPane().add(badd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, 60, 20));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "tanggal", "kegiatan", "surat", "waktu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 880, 440));

        tglcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglcariActionPerformed(evt);
            }
        });
        getContentPane().add(tglcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, 290, 30));

        bsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bsearchMouseClicked(evt);
            }
        });
        getContentPane().add(bsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 150, 30, 30));

        bdelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdeleteMouseClicked(evt);
            }
        });
        getContentPane().add(bdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 196, 30, 40));

        bedit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                beditMouseClicked(evt);
            }
        });
        getContentPane().add(bedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 250, 30, 30));
        getContentPane().add(txtsurat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 170, -1));
        getContentPane().add(txtwaktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 160, -1));

        cover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/KEGIATAN nw.png"))); // NOI18N
        getContentPane().add(cover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1239, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void baddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baddMouseClicked
        // TODO add your handling code here:
          {                                        
        String kegiatan = txtkegiatan.getText();
        String tanggal = txttgl.getText();
        String waktu = txtwaktu.getText();
        String surat = txtsurat.getText();
          try{
              Statement statement = (Statement) conek.GetConnection().createStatement();
              statement.executeUpdate("INSERT INTO kegiatan (date, kegiatan, surat, waktu) VALUES ('" 
                      + tanggal + "','" + kegiatan + "', '" + surat + "', '"+waktu+"')");
              datatable();
              reset();
          } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e);
          }   
    }                                       
    }//GEN-LAST:event_baddMouseClicked

    private void bsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsearchMouseClicked
            try {
                Statement statement = (Statement) conek.GetConnection().createStatement();
                ResultSet res = statement.executeQuery("SELECT * FROM kegiatan WHERE nomor LIKE '%" + tglcari.getText() + "%' "
                    + "OR date LIKE '%" + tglcari.getText() + "%' "
                    + "OR kegiatan LIKE '%" + tglcari.getText() + "%' "
                    + "OR surat LIKE '%" + tglcari.getText() + "%' "
                    + "OR waktu LIKE '%" + tglcari.getText() + "%' " );

                DefaultTableModel tbl = new DefaultTableModel();
                tbl.addColumn("date");
                tbl.addColumn("kegiatan");
                tbl.addColumn("surat");
                tbl.addColumn("waktu");


                boolean found = false; // Menandai apakah hasil pencarian ditemukan atau tidak
                while (res.next()) {
                    tbl.addRow(new Object[]{
                            res.getString("date"),
                            res.getString("kegiatan"),
                            res.getString("surat"),
                            res.getString("waktu")
                    });
                    found = true; // Setel ke true jika setidaknya satu hasil pencarian ditemukan
                }

                table.setModel(tbl);

                    // Jika hasil pencarian tidak ditemukan, kosongkan tabel
                    if (!found) {
                        tbl.setRowCount(0); // Menghapus semua baris dari tabel
                    }

        }catch (Exception e) {

        }
    }//GEN-LAST:event_bsearchMouseClicked

    private void bdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdeleteMouseClicked
        // TODO add your handling code here:
        String kegiatan = txtkegiatan.getText();
        String Date = txttgl.getText();
        String waktu = txtwaktu.getText();
        String surat = txtsurat.getText();
        
        
        try{
            Statement statement = (Statement) conek.GetConnection().createStatement();
            statement.executeUpdate("DELETE from kegiatan where kegiatan =('" + kegiatan +"');");
            JOptionPane.showMessageDialog(null, "data berhasil di HAPUS");
            txtkegiatan.setText("");
            txttgl.setText("");
            txtwaktu.setText("");
            txtsurat.setText("");
            txtkegiatan.requestFocus();  
        }catch (Exception t) {
            JOptionPane.showMessageDialog(null, "data gagal di HAPUS");
        }
        datatable();                              
                                      

         
    }//GEN-LAST:event_bdeleteMouseClicked

    private void tglcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglcariActionPerformed

    private void beditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beditMouseClicked
        // TODO add your handling code here:
        String kegiatan = txtkegiatan.getText();
        String date = txttgl.getText();
        String waktu = txtwaktu.getText();
        String surat = txtsurat.getText();
        
        try{
        Statement statement = (Statement) conek.GetConnection().createStatement();
            statement.executeUpdate("UPDATE kegiatan SET kegiatan='" + txtkegiatan.getText() 
                    + "',kegiatan='" + txtkegiatan.getText() 
                    + "',date='" + txttgl.getText() 
                    + "',waktu='" + txtwaktu.getText()  
                    + "',surat='" + txtsurat.getText()  
                    + "'where kegiatan='"+ txtkegiatan.getText() + "'");
            JOptionPane.showMessageDialog(this, "Berhasil di Edit");
        }catch (Exception t){
               
                }
        datatable(); 
    }//GEN-LAST:event_beditMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int baris = table.rowAtPoint(evt.getPoint());
        String tgl = table.getValueAt(baris, 0).toString();
        txttgl.setText(tgl);
        String nama = table.getValueAt(baris , 1).toString();
        txtkegiatan.setText(nama);
        String waktu = table.getValueAt(baris , 3).toString();
        txtwaktu.setText(waktu);
        String surat = table.getValueAt(baris,2).toString();
        txtsurat.setText(surat);
        
    }//GEN-LAST:event_tableMouseClicked

    private void txttglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttglActionPerformed

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
            java.util.logging.Logger.getLogger(kegiatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kegiatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kegiatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kegiatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kegiatan().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel badd;
    private javax.swing.JLabel bdelete;
    private javax.swing.JLabel bedit;
    private javax.swing.JLabel bsearch;
    private javax.swing.JLabel cover;
    private com.raven.datechooser.DateChooser dateChooser3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JTextField tglcari;
    private javax.swing.JTextField txtkegiatan;
    private javax.swing.JTextField txtsurat;
    private javax.swing.JTextField txttgl;
    private com.github.lgooddatepicker.components.TimePicker txtwaktu;
    // End of variables declaration//GEN-END:variables

}
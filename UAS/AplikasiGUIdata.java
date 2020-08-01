/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import PERTMUAN10.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author iqbal
 */
public class AplikasiGUIdata extends javax.swing.JFrame {

    /**
     * Creates new form koneksiGUI
     */
    public AplikasiGUIdata() {
        initComponents();
        this.setTitle("Apllikasi Data Mahasiswa");
        this.setLocationRelativeTo(this);

        koneksidata konek = new koneksidata();
        konek.Koneksi();
        statusKoneksi.setText(konek.statusKoneksi);

        ButtonGroup bG = new ButtonGroup();
        bG.add(ip_lakilaki);
        bG.add(ip_pr);

        table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ip_nim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ip_nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ip_alamat = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        ip_lakilaki = new javax.swing.JRadioButton();
        ip_pr = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pencarian = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelidentitas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        statusKoneksi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA PRODUK PENYEWAAN ALAT OUTDOOR");

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("INPUT DATA MAHASISWA"));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel3.setText("NOMOR BARANG");

        ip_nim.setBackground(new java.awt.Color(102, 153, 0));

        jLabel4.setText("NAMA BARANG");

        ip_nama.setBackground(new java.awt.Color(255, 0, 255));

        jLabel5.setText("HARGA SEWA BARANG");

        ip_alamat.setBackground(new java.awt.Color(255, 204, 0));
        ip_alamat.setColumns(20);
        ip_alamat.setRows(5);
        jScrollPane1.setViewportView(ip_alamat);

        jLabel6.setText("JENIS KELAMIN");

        ip_lakilaki.setText("LAKI-LAKI");
        ip_lakilaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ip_lakilakiActionPerformed(evt);
            }
        });

        ip_pr.setText("PEREMPUAN");
        ip_pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ip_prActionPerformed(evt);
            }
        });

        jButton1.setText("SIMPAN DATA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("PENCARIAN DATA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pencarian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilih", "NIM", "NAMA", "ALAMAT", "JENIS KELAMIN" }));
        pencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencarianActionPerformed(evt);
            }
        });

        jButton3.setText("HAPUS DATA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        reset.setText("RESET DATA");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        update.setText("UBAH DATA");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("OUTPUT DATA MAHASISWA"));

        tabelidentitas.setBackground(new java.awt.Color(255, 0, 0));
        tabelidentitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "NAMA", "ALAMAT", "JENIS KELAMIN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelidentitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelidentitasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelidentitas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342))
        );

        jLabel2.setText("STATUS DATA TERKONEKSI");

        statusKoneksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusKoneksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(statusKoneksi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ip_nim)
                                .addComponent(ip_nama)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ip_lakilaki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ip_pr)))
                        .addGap(18, 33, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ip_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ip_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(77, 77, 77))
                            .addComponent(jScrollPane1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ip_lakilaki)
                                    .addComponent(ip_pr))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(statusKoneksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Statement pst;
    ResultSet rs;

    public void table() {

        koneksidata konek = new koneksidata();
        konek.Koneksi();

        try {
            String sql = "select * from idmahasiswa";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabelidentitas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void selectByNim(int NIM) {
        koneksidata konek = new koneksidata();
        konek.Koneksi();

        try {
            String sql = "select * from idmahasiswa where NIM like '%" + NIM + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabelidentitas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void selectByNama(String NAMA) {
        koneksidata konek = new koneksidata();
        konek.Koneksi();

        try {
            String sql = "select * from idmahasiswa where NAMA like '%" + NAMA + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabelidentitas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void selectByAlamat(String ALAMAT) {
        koneksidata konek = new koneksidata();
        konek.Koneksi();

        try {
            String sql = "select * from idmahasiswa where ALAMAT like '%" + ALAMAT + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabelidentitas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void selectByjk(String jeniskelamin) {
        koneksidata konek = new koneksidata();
        konek.Koneksi();

        try {
            String sql = "select * from idmahasiswa where JENISKELAMIN like '%" + jeniskelamin + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabelidentitas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void statusKoneksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusKoneksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusKoneksiActionPerformed

    private void ip_lakilakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ip_lakilakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ip_lakilakiActionPerformed

    private void ip_prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ip_prActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ip_prActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String jenis = "";
        if (ip_lakilaki.isSelected()) {
            jenis = "L";
        } else if (ip_pr.isSelected()) {
            jenis = "P";
        }

        Insertdata in = new Insertdata();

        int NIM = Integer.parseInt(ip_nim.getText());
        String NAMA = ip_nama.getText();
        String ALAMAT = ip_alamat.getText();

        in.insert(NIM, NAMA, ALAMAT, jenis);

        table();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pencarianActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        if (pencarian.getSelectedIndex() == 1) {

            selectByNim(Integer.parseInt(ip_nim.getText()));

        } else if (pencarian.getSelectedIndex() == 2) {
            selectByNama(ip_nama.getText());
        } else if (pencarian.getSelectedIndex() == 3) {
            selectByAlamat(ip_alamat.getText());
        } else if (pencarian.getSelectedIndex() == 4) {

            String jeniskelamin = "";
            if (ip_lakilaki.isSelected()) {
                jeniskelamin = "L";

            } else if (ip_pr.isSelected()) {
                jeniskelamin = "P";
            }
            selectByjk(jeniskelamin);

        } else {
            table();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabelidentitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelidentitasMouseClicked
         DefaultTableModel dtm = (DefaultTableModel) tabelidentitas.getModel(); //create a model
        int selectedRowIndex = tabelidentitas.getSelectedRow(); //get selected row
        int id = (int) dtm.getValueAt(selectedRowIndex, 0); //get the primary key to fetch data.

        koneksidata konek = new koneksidata();
        konek.Koneksi();

        try {

            String sql = "select * from idmahasiswa where NIM like '%" + id + "%'";
            pst = (Statement) konek.con.prepareStatement(sql);
            ResultSet rs = rs = pst.executeQuery(sql);

            while (rs.next()) {    //u can use normal query
                ip_nim.setText(rs.getString("nim"));
                ip_nama.setText(rs.getString("nama"));
                ip_alamat.setText(rs.getString("alamat"));
                String jenis = rs.getString("jeniskelamin");
                if (jenis.equals("L")) {
                    ip_lakilaki.setSelected(true);
                } else {
                    ip_pr.setSelected(true);
                }

            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_tabelidentitasMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        koneksidata konek = new koneksidata();
        konek.Koneksi();
        
        Deletedata del = new Deletedata();
        del.Delete(Integer.parseInt(ip_nim.getText()));
        
        
        table();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        ip_nim.setText("");
        ip_nama.setText("");
        ip_alamat.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       koneksidata konek = new koneksidata();
        konek.Koneksi();

        Updatedata ubah = new Updatedata();

        String nama = ip_nama.getText();
        String alamat = ip_alamat.getText();
        String jenis = "";
        if (ip_lakilaki.isSelected()){
            jenis = "L";
        } else if (ip_pr.isSelected()) {
            jenis = "P";
        }

        ubah.update(Integer.parseInt(ip_nim.getText()), nama, alamat, jenis);

        table();
    }//GEN-LAST:event_updateActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplikasiGUIdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiGUIdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiGUIdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiGUIdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiGUIdata().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ip_alamat;
    private javax.swing.JRadioButton ip_lakilaki;
    private javax.swing.JTextField ip_nama;
    private javax.swing.JTextField ip_nim;
    private javax.swing.JRadioButton ip_pr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> pencarian;
    private javax.swing.JButton reset;
    private javax.swing.JTextField statusKoneksi;
    private javax.swing.JTable tabelidentitas;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

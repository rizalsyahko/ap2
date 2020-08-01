/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import PERTMUAN10.*;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author iqbal
 */
public class Updatedata {
     koneksidata konek = new koneksidata();

    public void update(int NIM, String NAMA, String ALAMAT, String JK) {

        try {
            konek.Koneksi();
            java.sql.Statement statement = konek.con.createStatement();

            String sql_NAMA = "update idmahasiswa set NAMA = '" + NAMA + "'where NIM = '" + NIM + "'";
            String sql_ALAMAT = "update idmahasiswa set ALAMAT = '" + ALAMAT + "'where NIM = '" + NIM + "'";
            String sql_JK= "update idmahasiswa set JENISKELAMIN = '" + JK + "'where NIM = '" + NIM + "'";
            String sql_NIM = "update idmahasiswa set NIM = '" + NIM + "'where NAMA = '" + NAMA + "'";
            String sql_NIM2 = "update idmahasiswa set NIM = '" + NIM + "'where ALAMAT = '" + ALAMAT + "'";

            statement.executeUpdate(sql_NIM);
            statement.executeUpdate(sql_NIM2);
            statement.executeUpdate(sql_NAMA);
            statement.executeUpdate(sql_ALAMAT);
            statement.executeUpdate(sql_JK);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

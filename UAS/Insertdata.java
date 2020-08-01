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
public class Insertdata {

    koneksidata konek = new koneksidata();

    public void insert(int NIM, String NAMA, String ALAMAT, String JK) {
        
        try {
        
            konek.Koneksi();
            Statement statement = konek.con.createStatement();

//            String sql = "insert into idmahasiswa (NIM, NAMA, ALAMAT, JENIS KELAMIN)('" + NIM + "','" + NAMA + "','" + ALAMAT + "','" + JK + "');";
            String sql = "insert into idmahasiswa values('" + NIM + "','" + NAMA + "','" + ALAMAT + "','" + JK + "')";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}

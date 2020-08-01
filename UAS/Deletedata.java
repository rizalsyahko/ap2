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
public class Deletedata {
        koneksidata konek = new koneksidata();

    public void Delete(int NIM){
        try {
        
            konek.Koneksi();
            Statement statement = konek.con.createStatement();

            String sql = "Delete from idmahasiswa where NIM = '" + NIM +"'";
            statement.executeUpdate(sql);
            statement.close();
            
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus ");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTMUAN10;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author iqbal
 */
public class koneksi {
    public static void main(String[] args) {
        
        koneksi tesKoneksi = new koneksi ();
        tesKoneksi.Koneksi();
    }
    
    Connection con=null;
    
    String statusKoneksi;
    public void Koneksi()
    {
        try
        {
            String connectionURL = "jdbc:mysql://localhost/Rizal_s";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(connectionURL, username, password);
            // JOptionPane.showMessageDialog(null,"Sukses Koneksi");
            statusKoneksi = "BERHASIL";
        }catch(Exception e){
            // JOptionPane.showMessageDialog(null, e);
            statusKoneksi = "TIDAK BERHASIL";
            // System.exit(0);
        }
    }
}

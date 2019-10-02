/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksidbversipbolegal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Zuhdan
 */
public class SQLiteConnection {
  
    public static Connection connect(){
        Connection con = null;
        try{
            String url = "jdbc:sqlite:"+System.getProperty("user.dir")+"\\data\\data.sqlite";
            con = DriverManager.getConnection(url);
            

            // System.out.println("Sukses");
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Kesalahan LINK INI \n"+System.getProperty("user.dir")+"\\data\\data.sqlite");
        }
        return con;
    }
}

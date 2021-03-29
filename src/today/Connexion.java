/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package today;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP 8470P
 */
public class Connexion {
    public static Connection Seconnecter()
    {
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","DIARY","123456");
            
            System.out.println("Successfully connected to oracle database " + "DIARY");
            
            return conn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

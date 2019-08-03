
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class MySQLConnect {
    
    public static Connection connectDB(){
        /*
            Thhis method is used to create connection object.
            Here database name is empdb
            Username and Password is static
            if connection is established it will return connection object else it will return null
        */
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "Jatin Sumai", "jatin@99");
//            JOptionPane.showMessageDialog(null, "Connection Successfull!", "Connection!", JOptionPane.INFORMATION_MESSAGE);
            return conn;
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Unsuccessfull! : " + e.getMessage(), "Connection!", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Unsuccessfull! : " + e.getMessage(), "Connection!", JOptionPane.ERROR_MESSAGE);
        }
        return null;
}
}

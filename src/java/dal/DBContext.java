/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.DBContext to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nguye
 */
public class DBContext {
    
    protected Connection conn;
    
    public Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=4USER_PRJ301";
            String user = "sa";
            String password = "sa";
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Error " + e.getMessage() + " at DBContext");
            return null;
        }
    }
}

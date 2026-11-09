/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aljoh
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    
    public static Connection connect() {
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/GymDB", "root", "1234"
            );
            return conn;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}

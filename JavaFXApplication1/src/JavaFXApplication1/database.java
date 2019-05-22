/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFXApplication1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rohit
 */
public class database {

    public  void fun() {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
        String query = "Select * from DATA";

        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/first", "root", "root");
            statement = connection.createStatement();
            resultset=statement.executeQuery(query);
            while(resultset.next())
            {
                System.out.println(resultset.getString("NAME"));
            }
            
        
        
        
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

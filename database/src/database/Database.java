
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {

    
    public static void main(String[] args) throws SQLException {
        
        Connection connection;
        Statement statement;
        ResultSet resultset;
        
        String url = "jdbc:derby://localhost:1527/gg";
        String query = "SELECT * from DATA";
        //Class.forName(url)
        connection = DriverManager.getConnection(url,"root","root");
        statement = connection.createStatement();
        resultset  =  statement.executeQuery(query);
        while(resultset.next())
        {
            System.out.println(resultset.getString("USERNAME"));
        }
       
        
        
        
        
        
        
    }
    
}

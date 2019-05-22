package loginproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public  class dbHandler {

    public static boolean login(String username, String password) {
        Connection connection;
        Statement statment;
        ResultSet resultSet;
        String url = "jdbc:derby://localhost:1527/loginService";
        try {
            connection = DriverManager.getConnection(url, "root", "root");
            statment = connection.createStatement();
            resultSet = statment.executeQuery("select * from LOGINDETAILS");
            while (resultSet.next()) {
                if (resultSet.getString("USERNAME").equals(username) && resultSet.getString("PASSWORD").equals(password)) {
                    return true;
                }

            }
            return false;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        
    }
    public static void fun()
    {
        Connection connection;
        Statement statment;
        ResultSet resultSet;
       
        try {
            connection= DriverManager.getConnection("jdbc:derby://localhost:1527/loginService", "root", "root");
            statment = connection.createStatement();
            resultSet = statment.executeQuery("SELECT * FROM LOGINDETAILS");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("USERNAME")+resultSet.getString("PASSWORD"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static boolean signup(String username, String password) {
        Connection connection;
        PreparedStatement statment;
        ResultSet resultSet;
        String url = "jdbc:derby://localhost:1527/loginService";
        String sql = "INSERT INTO LOGINDETAILS (USERNAME,PASSWORD)VALUES(?,?)";
        
        try {
            connection = DriverManager.getConnection(url, "root", "root");
            statment = connection.prepareStatement(sql);
            statment.setString(1, username);
            statment.setString(2, password);
            statment.executeUpdate();
            connection.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        

    }
    public static void print(String username,String password)
    {
        Connection connection;
        Statement statment;
        ResultSet resultSet;
        String url = "jdbc:derby://localhost:1527/loginService";
        try {
            connection = DriverManager.getConnection(url, "root", "root");
            statment = connection.createStatement();
            resultSet = statment.executeQuery("SELECT * FROM LOGINDETAILS");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("USERNAME") + resultSet.getString("PASSWORD"));

            }
           

        } catch (SQLException e) {
            e.printStackTrace();
           
        }
    }
}

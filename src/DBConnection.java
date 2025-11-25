package dbProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
           String url = "jdbc:ucanaccess://C:/Users/Alsar/Downloads/Project-main/Project-main/src/dbProject/MrjanTripBooking.accdb";
            conn = DriverManager.getConnection(url);
            System.out.println("Connected successfully!");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
        return conn;
    }
    public static void executeUpdate(String query) {
        Connection conn = connect();
        try {
            if (conn != null) {
                Statement statement = conn.createStatement();
                statement.executeUpdate(query); 
                System.out.println("Query executed successfully!");
            } else {
                System.err.println("Unable to execute query: No database connection.");
            }
        } catch (SQLException e) {
            System.err.println("SQL Exception in executeUpdate: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close(); 
                }
            } catch (SQLException e) {
                System.err.println("Error closing connection: " + e.getMessage());
            }
        }
    }
    public static ResultSet executeQuery(String query) {
        Connection conn = connect();
        ResultSet result = null;
        try {
            if (conn != null) {
                Statement statement = conn.createStatement();
                result = statement.executeQuery(query); 
            } else {
                System.err.println("Unable to execute query: No database connection.");
            }
        } catch (SQLException e) {
            System.err.println("SQL Exception in executeQuery: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close(); 
                }
            } catch (SQLException e) {
                System.err.println("Error closing connection: " + e.getMessage());
            }
        }
        return result;
    }
}


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    // دالة الاتصال بالقاعدة
    public static Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:ucanaccess://C:/Users/Alsar/Desktop/my homeworks/dbProject/MrjanTripBooking.accdb";
            conn = DriverManager.getConnection(url);
            System.out.println("Connected successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}

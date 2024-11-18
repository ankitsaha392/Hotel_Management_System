
import java.sql.*;

public class conn {
 Connection c;
 Statement s;

 public conn() {
     try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         String url = "jdbc:mysql:///hms?useSSL=false&serverTimezone=UTC";
         String username = "root";
         String password = "";
         c = DriverManager.getConnection(url, username, password);
         s = c.createStatement();
     } catch (Exception e) {
         System.out.println("Connection failed: " + e.getMessage());
         e.printStackTrace();
     }
 }
}


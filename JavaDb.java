import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db_connect {
public static void main(String[] args) { Connection connection = null;
try {

String url = "jdbc:mysql://localhost:3306/";
String username = "root";
String password = "root";
connection = DriverManager.getConnection(url, username, password);
// Step 3: Connection successful
System.out.println("Connected to the MySQL database!");
} catch (ClassNotFoundException | SQLException e) { e.printStackTrace();


} finally {
// Step 4: Close the connection try {
if (connection != null) { connection.close();
}
} catch (SQLException e) {
e.printStackTrace(); }
}
}
}
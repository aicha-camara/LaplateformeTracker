// Database.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
    private Connection connexion;
    private PreparedStatement curseur;

    // Database connection details
    private static final String HOST = "localhost";
    private static final String USER = "root";
    private static final String PASSWORD = "za9?-U5zwD4-6#L";
    private static final String DATABASE = "tracker";

    // Constructor to initialize the connection
    public Database() throws SQLException {
        try {
            this.connexion = DriverManager.getConnection(
                "jdbc:mysql://" + HOST + "/" + DATABASE, USER, PASSWORD
            );
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            throw e;
        }
    }
}

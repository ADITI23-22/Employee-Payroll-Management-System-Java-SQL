package service;  // must match folder name (all lowercase)
import java.sql.*;  // enables SQL connectivity

public class DatabaseConnection {

    // MySQL credentials
    private static final String URL = "jdbc:mysql://localhost:3306/employee_payroll";
    private static final String USER = "root"; // your MySQL username
    private static final String PASSWORD = "root"; // your MySQL password

    // ✅ Static method that other classes can call
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("❌ Database connection failed: " + e.getMessage());
            return null;
        }
    }

    // 🔹 Main method to test database connection
    public static void main(String[] args) {
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("✅ Database connected successfully!");
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("❌ Failed to connect to database.");
        }
    }
}


package service;
import model.Employee;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PayrollService {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
        saveToDatabase(emp);
    }

    public void showEmployees() {
        for (Employee emp : employees) emp.displayInfo();
    }

    private void saveToDatabase(Employee e) {
        String query = "INSERT INTO employee_data (name, designation, basic_salary, tax, net_salary) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, e.getName());
            ps.setString(2, e.getDesignation());
            ps.setDouble(3, e.getNetSalary() + e.getNetSalary() * 0.1);
            ps.setDouble(4, 0.1 * e.getNetSalary());
            ps.setDouble(5, e.getNetSalary());
            ps.executeUpdate();
            System.out.println("✅ Employee saved to database.");
        } catch (SQLException ex) {
            System.out.println("❌ Error saving employee: " + ex.getMessage());
        }
    }
}

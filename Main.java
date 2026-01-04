import model.Employee;
import service.PayrollService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayrollService payroll = new PayrollService();

        while (true) {
            System.out.println("\n=== Employee Payroll Management ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Show All Employees");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt(); sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Designation: ");
                    String designation = sc.nextLine();
                    System.out.print("Enter Basic Salary: ");
                    double salary = sc.nextDouble();

                    Employee emp = new Employee(id, name, designation, salary);
                    payroll.addEmployee(emp);
                }
                case 2 -> payroll.showEmployees();
                case 3 -> {
                    System.out.println("Exiting Program. 👋");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option! Try again.");
            }
        }
    }
}

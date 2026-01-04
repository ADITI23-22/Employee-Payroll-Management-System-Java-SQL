package model;

public class Employee {
    private int id;
    private String name;
    private String designation;
    private double basicSalary;
    private double tax;
    private double netSalary;

    public Employee(int id, String name, String designation, double basicSalary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.basicSalary = basicSalary;
        this.tax = 0.1 * basicSalary;
        this.netSalary = basicSalary - tax;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDesignation() { return designation; }
    public double getNetSalary() { return netSalary; }

    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name +
                " | Role: " + designation +
                " | Net Salary: " + netSalary);
    }
}


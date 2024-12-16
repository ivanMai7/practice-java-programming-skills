package xyz.ivan.skills.oop.hard._01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create instances of employees
        HourlyEmployee hourlyEmployee = new HourlyEmployee("John Doe", 1, 20.0, 160);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Jane Smith", 2, 3000.0);

        // Create an instance of EmployeeManager and add employees
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(hourlyEmployee);
        manager.addEmployee(salariedEmployee);

        // Calculate and print total salary
        System.out.println("Total Salary: " + manager.calculateTotalSalary());
    }
}

// Base class Employee with name, id, and abstract method calculate_salary()
abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();
}

// Subclass HourlyEmployee with hourly rate and hours worked
class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Subclass SalariedEmployee with monthly salary
class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// EmployeeManager class to manage all employees and calculate total salary
class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.calculateSalary();
        }
        return totalSalary;
    }
}

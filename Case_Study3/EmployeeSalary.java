package Case_Study3;

import java.util.Scanner;

class Employee {

    int employeeId;
    String name;
    double basicSalary;

    double calculateHRA() {
        return basicSalary * 0.20;
    }

    double calculateDA() {
        return basicSalary * 0.10;
    }

    double calculateGrossSalary() {
        double hra = calculateHRA();
        double da = calculateDA();

        return basicSalary + hra + da;
    }

    void displaySalaryDetails() {
        double hra = calculateHRA();
        double da = calculateDA();
        double grossSalary = calculateGrossSalary();

        System.out.println("\n----- Employee Salary Details -----");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class EmployeeSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Enter Employee ID: ");
        employee.employeeId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        employee.name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        employee.basicSalary = sc.nextDouble();

        employee.displaySalaryDetails();

        sc.close();
    }
}
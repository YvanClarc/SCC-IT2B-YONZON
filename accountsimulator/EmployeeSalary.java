
package accountsimulator;

import java.util.Scanner;

 public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no. of Employee: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Employee[] employees = new Employee[numEmployees];
        double totalSalaryRequest = 0;
        double totalDeduction = 0;
        double totalNetPay = 0;

        // Input loop for each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details of employee: " + (i + 1));
            
            System.out.print("ID: ");
            String id = scanner.nextLine();
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Rate: ");
            double rate = scanner.nextDouble();
            
            System.out.print("Hours Worked: ");
            int hoursWorked = scanner.nextInt();
            
            System.out.print("Deduction: ");
            double deduction = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Creating an Employee object
            employees[i] = new Employee(id, name, rate, hoursWorked, deduction);
            totalSalaryRequest += employees[i].calculateGross();
            totalDeduction += employees[i].deduction;
            totalNetPay += employees[i].calculateNetPay();
        }

        // Displaying the salary details
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                          "ID", "Name", "Rate", "Hours", "Gross", "Deduction", "Netpay");
        
        for (Employee employee : employees) {
            System.out.printf("%-10s %-10s %-10.2f %-10d %-10.2f %-10.2f %-10.2f\n",
                employee.id,
                employee.name,
                employee.rate,
                employee.hoursWorked,
                employee.calculateGross(),
                employee.deduction,
                employee.calculateNetPay()
            );
        }

        // Displaying total calculations
        System.out.println("--------------------------------------------------");
        System.out.printf("Total Salary Request: %.2f\n", totalSalaryRequest);
        System.out.printf("Total Employee Deduction: %.2f\n", totalDeduction);
        System.out.printf("Total Netpay: %.2f\n", totalNetPay);
        System.out.printf("No. of Employee: %d\n", numEmployees);

        scanner.close();
    }
}

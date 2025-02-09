package Guvitask3;

import java.util.Scanner;

public class DraiverMain {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input Employee details
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        
        Employee emp = new Employee(empId, name, salary);
        System.out.println("Income Tax for Employee: " + emp.calcTax());
        
        // Input Product details
        System.out.print("Enter Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Product Quantity: ");
        int quantity = scanner.nextInt();
        
        Product2 prod = new Product2(pid, price, quantity);
        System.out.println("Sales Tax per unit: " + prod.calcTax());
        System.out.println("Sales Tax all unit: " + prod.calcTax()*quantity);
        scanner.close();
    }

}

package com.java.Arrays.Exercise.practice.employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();

        PracticeOnUserIP_Employee[] employee=new PracticeOnUserIP_Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Phone Number: ");
            String phNo = sc.nextLine();

            System.out.print("Age: ");
            byte age = sc.nextByte();

            System.out.print("Salary: ");
            int salary = sc.nextInt();
            sc.nextLine(); // Consume newline character

            System.out.print("Email: ");
            String email = sc.nextLine();

            // Create and store the employee object
            employee[i] = new PracticeOnUserIP_Employee(name, phNo, age, salary, email);
        }

        // Display the company name
        System.out.println("\n");
        PracticeOnUserIP_Employee.getCompanyName();

        // Display employee details
        System.out.println("\nEmployee Details:");
        for (PracticeOnUserIP_Employee emp : employee) {
            emp.getDetailsInfo();
            System.out.println("---------------------");
        }
    }
}

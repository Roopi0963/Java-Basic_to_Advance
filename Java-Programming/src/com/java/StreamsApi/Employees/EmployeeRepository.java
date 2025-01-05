package com.java.StreamsApi.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class EmployeeRepository {
    private List<Employee> employeeList;

    public EmployeeRepository() {
        this.employeeList = new ArrayList<>();
        // Adding employees to the list


        employeeList.add(new Employee(1, "Alice", (int) 9876543210L, 25, "alice@example.com", 55000.00, "IT"));
        employeeList.add(new Employee(2, "Bob", (int) 9876543211L, 30, "bob@example.com", 60000.00, "HR"));
        employeeList.add(new Employee(3, "Charlie", (int) 9876543212L, 28, "charlie@example.com", 58000.00, "Finance"));
        employeeList.add(new Employee(4, "David", (int) 9876543213L, 32, "david@example.com", 62000.00, "Marketing"));
        employeeList.add(new Employee(5, "Eve", (int) 9876543214L, 29, "eve@example.com", 57000.00, "IT"));
        employeeList.add(new Employee(6, "Frank", (int) 9876543215L, 35, "frank@example.com", 65000.00, "Operations"));
        employeeList.add(new Employee(7, "Grace", (int) 9876543216L, 26, "grace@example.com", 54000.00, "Admin"));
        employeeList.add(new Employee(8, "Hank", (int) 9876543217L, 31, "hank@example.com", 61000.00, "Logistics"));
        employeeList.add(new Employee(9, "Ivy", (int) 9876543218L, 27, "ivy@example.com", 56000.00, "Design"));
        employeeList.add(new Employee(10, "Jack", (int) 9876543219L, 33, "jack@example.com", 63000.00, "Engineering"));
    }

    public List<Employee> getEmployees() {
        return this.employeeList;
    }

}



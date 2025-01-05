package com.java.StreamsApi.Employees;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository=new EmployeeRepository();
        EmployeeService employeeService=new EmployeeService(employeeRepository);

        employeeService.getEmployees();
        List<Employee> employeeList=employeeService.getEmployees();

//        employeeList.forEach(System.out::println);

        employeeService.filterBySalary(62000).forEach(System.out::println);

        employeeService.getEmployeeDetails();

        employeeService.getEmployeeEmails().forEach(System.out::println);




    }

}

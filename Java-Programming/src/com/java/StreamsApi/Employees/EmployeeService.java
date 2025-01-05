package com.java.StreamsApi.Employees;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    private EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees(){
        return this.employeeRepository.getEmployees();
    }

    public List<Employee> filterBySalary(double minSalary){
        return this.employeeRepository.getEmployees().stream()
                .filter(employee -> employee.getSalary() >= minSalary)
                .collect(Collectors.toList());

    }


    public void getEmployeeDetails(){
        this.employeeRepository.getEmployees().stream().forEach(employee -> {
            System.out.println("Id : "+employee.getId());
            System.out.println("Name : "+employee.getName());
        });
    }



    public List<String> getEmployeeEmails(){
        return this.employeeRepository.getEmployees().stream().map(Employee::getEmail).collect(Collectors.toUnmodifiableList());
    }
}

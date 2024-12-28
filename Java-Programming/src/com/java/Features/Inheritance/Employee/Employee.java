package com.java.Features.Inheritance.Employee;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus(){
        System.out.println("Employee class ....");
        return salary*0.10;
    }

    public void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }


}

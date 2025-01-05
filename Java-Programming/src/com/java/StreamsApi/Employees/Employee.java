package com.java.StreamsApi.Employees;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private int PhNo;
    private int age;
    private String email;
    private double salary;
    private String department;

//    public Employee() {
//    }

    public Employee(int id, String name, int phNo, int age, String email, double salary, String department) {
        this.id = id;
        this.name = name;
        this.PhNo = phNo;
        this.age = age;
        this.email = email;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhNo() {
        return PhNo;
    }

    public void setPhNo(int phNo) {
        PhNo = phNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && PhNo == employee.PhNo && age == employee.age && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(email, employee.email) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, PhNo, age, email, salary, department);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", PhNo=" + PhNo +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

package com.java.Arrays.Exercise.practice.employee;

public class PracticeOnUserIP_Employee {
    String name;
    String phNo;
    byte age;
    int salary;
    String email;


    public static String CompanyName="TCS";

    public PracticeOnUserIP_Employee(String name, String phNo, byte age, int salary, String email) {
        this.name = name;
        this.phNo = phNo;
        this.age = age;
        this.salary = salary;
        this.email = email;
    }

    public static void getCompanyName(){
        System.out.println("Company Name : "+CompanyName);
    }

    void getDetailsInfo(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Phone Number : "+phNo);
        System.out.println("Email : "+email);
        System.out.println("Salary : "+salary);

    }
}

package com.java.oops.constructors.Excersice.EmployeeManagement;

public class Employee {
    String name;
    byte age;
    String email;
    String phoneNo;
    String profession;
    int salary;
    int increment;
    int hike;

    final static String CompanyName="TCS";

    public Employee(String name, byte age, String email, String phoneNo, String profession, int salary, int increment,int hike) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNo = phoneNo;
        this.profession = profession;
        this.salary = salary;
        this.increment = increment;
        this.hike = hike;
    }



    int hikeofEmployee(){
        int totalSalary;
        totalSalary=salary+hike;
        System.out.println("Total salary with hike : "+totalSalary);
        return totalSalary;
    }

    int salaryIncrement(){
        int finalSalary;
        System.out.println("The salary is...........");
        finalSalary=salary+(salary*increment/100);

        return finalSalary;
    }


    void displayInfo(){
        System.out.println("Name of the employee : "+name);
        System.out.println("Age : "+age);
        System.out.println("Mobile No : "+phoneNo);
        System.out.println("Email : "+email);
        System.out.println("Profession : "+profession);
        hikeofEmployee();
        System.out.println("Total salary : "+salaryIncrement());


    }

}

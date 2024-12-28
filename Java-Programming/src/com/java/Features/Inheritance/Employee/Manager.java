package com.java.Features.Inheritance.Employee;

public class Manager extends Employee {

    double bonusPercentage;

    public Manager(String name, double salary, double bonusPercentage) {
        super(name, salary);
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double calculateBonus() {
        System.out.println("Manager class ......");
        double total = salary+(salary*bonusPercentage) / 100;
        return total;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus percentage is : "+bonusPercentage+"%");
        System.out.println("Total : "+calculateBonus());
    }
}

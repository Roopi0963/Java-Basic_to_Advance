package com.java.Features.Inheritance.Employee;

public class Developer extends Employee{

    double fixedbouns;

    public Developer(String name, double salary, double fixedbouns) {
        super(name, salary);
        this.fixedbouns = fixedbouns;
    }

    @Override
    public double calculateBonus() {
        System.out.println("Developer class ......");
//        double total=salary+fixedbouns;
        return salary+fixedbouns;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fixed bouns is : "+fixedbouns);
        System.out.println("total : "+calculateBonus());
    }

}

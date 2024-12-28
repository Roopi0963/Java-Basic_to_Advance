package com.java.Features.Inheritance.Employee;

public class TestPolymorphsim {
    public static void main(String[] args) {
        Manager manager=new Manager("Roopi",100.00,10);
        manager.calculateBonus();
        manager.displayInfo();


        Developer developer=new Developer("Krish",100,50);
        developer.calculateBonus();
        developer.displayInfo();
    }


}

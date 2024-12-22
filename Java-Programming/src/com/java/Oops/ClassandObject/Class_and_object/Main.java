package com.java.training.oops.ClassandObject;

public class Main {
    public static void main(String[] args) {
        Customer customer1;
        customer1=new Customer();

        //creating values for state
        customer1.id=1;
        customer1.name="Rupee";
        customer1.contactNo="91+ 809630987";
        customer1.email="rupee@gamil.com";

        System.out.println(customer1.id);
        System.out.println(customer1.name);
        System.out.println(customer1.contactNo);
        System.out.println(customer1.email);

        Customer customer2;
        customer2=new Customer();

        customer2.id=2;
        customer2.name="Krish";
        customer2.contactNo="91+ 809630987";
        customer2.email="krish@gamil.com";

        System.out.println(customer2.id);
        System.out.println(customer2.name);
        System.out.println(customer2.contactNo);
        System.out.println(customer2.email);

    }
}

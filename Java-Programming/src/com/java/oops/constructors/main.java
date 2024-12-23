package com.java.oops.constructors;

public class main {
    public static void main(String[] args) {
        Customer customer;
        customer=new Customer();
        customer.displayDetails();

        Customer customer1=new Customer(123245,"Ravan","+91-21365","abc@gamil.com",(byte)35);
        customer1.displayDetails();
    }
}

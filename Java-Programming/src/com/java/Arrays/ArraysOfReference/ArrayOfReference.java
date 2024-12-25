package com.java.Arrays.ArraysOfReference;

import com.java.oops.constructors.Constructors.Customer;

public class ArrayOfReference {
    public static void main(String[] args) {
        Customer[] customers;
        customers = new Customer[3];
        customers[0]=new Customer(1200,"Krish","+91-1235487","abc@gmail.com",(byte)31);
        customers[1]=new Customer(1200,"Krish","+91-1235487","abc@gmail.com",(byte)31);
        customers[2]=new Customer(1200,"Krish","+91-1235487","abc@gmail.com",(byte)31);

       for(Customer customer:customers){
           customer.displayDetails();
       }

       Customer[]  customers1={new Customer(),
               new Customer(1200,"Krish","+91-1235487","abc@gmail.com",(byte)31),
               new Customer(1200,"Krish","+91-1235487","abc@gmail.com",(byte)31)
       };

       for(Customer customer : customers1){
           customer.name=customer.name.toUpperCase();
           customer.displayDetails();
       }
    }
}

package com.java.CollectionFrameworks;

import java.util.ArrayList;

public class ListImplementation {
    public static void main(String[] args) {
        Customer customer1 =new Customer();
        customer1.setId(001);
        customer1.setName("zoopi");
        customer1.setEmail("acb@gmail.com");
        customer1.setAge(21);
        System.out.println(customer1);

        Customer customer5 =new Customer();
        customer5.setId(5);
        customer5.setName("Roopi");
        customer5.setEmail("acb@gmail.com");
        customer5.setAge(21);

        Customer customer2 =new Customer();
        customer2.setId(2);
        customer2.setName("aoopi");
        customer2.setEmail("acb@gmail.com");
        customer2.setAge(21);

        Customer customer3 =new Customer();
        customer3.setId(3);
        customer3.setName("coopi");
        customer3.setEmail("acb@gmail.com");
        customer3.setAge(21);

        ArrayList<Customer> customer=new ArrayList<>();
        customer.add(customer1);
        customer.add(customer2);
        customer.add(customer3);
        customer.add(customer5);
//        System.out.println(customer);

        for(Customer custom : customer){
            System.out.println(custom);
        }
    }
}

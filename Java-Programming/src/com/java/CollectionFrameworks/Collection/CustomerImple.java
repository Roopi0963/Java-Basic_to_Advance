package com.java.CollectionFrameworks;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class CustomerImple {
    public static void main(String[] args) {
//        Customer customer=new Customer();
//
//        customer.setId(001);
//        customer.setName("zoopi");
//        customer.setEmail("acb@gmail.com");
//        customer.setAge(21);
//        System.out.println(customer);
//
//        Customer customer1 =new Customer();
//        customer1.setId(5);
//        customer1.setName("Roopi");
//        customer1.setEmail("acb@gmail.com");
//        customer1.setAge(21);
//
//        Customer customer2 =new Customer();
//        customer2.setId(2);
//        customer2.setName("aoopi");
//        customer2.setEmail("acb@gmail.com");
//        customer2.setAge(21);
//
//        Customer customer3 =new Customer();
//        customer3.setId(3);
//        customer3.setName("coopi");
//        customer3.setEmail("acb@gmail.com");
//        customer3.setAge(21);
//
////        HashSet<Customer> customerSet =new HashSet<>();
//        LinkedHashSet<Customer> customerSet =new LinkedHashSet<>();
//        customerSet.add(customer);
//        customerSet.add(customer1);
//        customerSet.add(customer2);
//        customerSet.add(customer3);
//
//        System.out.println(customerSet);
//        System.out.println(customerSet.size());
//

        CustomerService customerService1 =new CustomerService();
        customerService1.setId(001);
        customerService1.setName("zoopi");
        customerService1.setEmail("acb@gmail.com");
        customerService1.setAge(21);

        CustomerService customerService2 =new CustomerService();
        customerService2.setId(5);
        customerService2.setName("Roopi");
        customerService2.setEmail("acb@gmail.com");
        customerService2.setAge(21);

        CustomerService customerService3 =new CustomerService();
        customerService3.setId(2);
        customerService3.setName("aoopi");
        customerService3.setEmail("acb@gmail.com");
        customerService3.setAge(21);

        ArrayList<CustomerService> customerServices=new ArrayList<>();
        customerServices.add(customerService1);
        customerServices.add(customerService2);
        customerServices.add(customerService3);
        customerServices.add(customerService2);
        for(CustomerService customSercice :customerServices){
            customSercice.displayDetails(customSercice);
        }




    }

}

package com.java.Features.Abstraction.Customers;

public class Main {
    public static void main(String[] args) {
        //Customer customer2 = new Customer(564845, "avan", "+91-21365", "abc@gamil.com", (byte) 35);

        CustomerI customer=new CustomerI(1254,"kriah","21","452134","adw@gmail.com");

        MYSQLRepository repository=new MYSQLRepository();

        CustomerServiceImpl customerService=new CustomerServiceImpl(repository);

        customerService.addCustomerToDb(customer);

    }
}

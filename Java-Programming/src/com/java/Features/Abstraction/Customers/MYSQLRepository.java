package com.java.Features.Abstraction.Customers;

public class MYSQLRepository extends Repository {


    @Override
    void connectToDb() {
        System.out.println("Connection to MYSQL is successfully");
    }

    @Override
    void addCustomerToDb(CustomerI customerI) {
        System.out.println("Customer data is added to DB");

    }
}

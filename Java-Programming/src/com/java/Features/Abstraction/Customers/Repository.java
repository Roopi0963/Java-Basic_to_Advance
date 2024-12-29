package com.java.Features.Abstraction.Customers;

public abstract class Repository {
    abstract void connectToDb();
    abstract void addCustomerToDb(CustomerI customer);
}

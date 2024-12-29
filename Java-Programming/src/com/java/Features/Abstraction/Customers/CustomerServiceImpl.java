package com.java.Features.Abstraction.Customers;

public class CustomerServiceImpl extends CustomerService {

    Repository repository;

    public CustomerServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    void addCustomerToDb(CustomerI customerI) {
        repository.connectToDb();
        repository.addCustomerToDb(customerI);
    }
}

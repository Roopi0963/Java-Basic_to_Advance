package com.java.Features.Abstraction.Customers;

public class CustomerI {

    public int id;
    String name;
    String age;
    String phNo;
    String email;


    public CustomerI(int id, String name, String age, String phNo, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phNo = phNo;
        this.email = email;
    }
}

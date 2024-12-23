package com.java.oops.constructors;

public class Customer {
    int id;
    String name;
    String contNo;
    String email;
    byte age;

    final static String BRAND="Static is used for non changable data"; //Static Keyword

/*
    Constructor with out argument
 */
    Customer(){
        id=12345;
        name="Krish";
        contNo="+91-12346587";
        email="abcd@gmail.com";
        age=21;
        System.out.println("hello");
    }

    /*
        Constuctor with argument
     */

    Customer(int id, String name, String contNo, String email, byte age) {
        this.id = id;
        this.name = name;  //This key word is to asign local variable to instance variables
        this.contNo = contNo;
        this.email = email;
        this.age = age;
    }
    /*
         Method to display details
     */

    void displayDetails(){
        System.out.println("USing constructors ...........! ");
        System.out.println("Id : "+id);
        System.out.println("Name of the customer : "+name);
        System.out.println("ContactNo : "+contNo);
        System.out.println("Age : "+age);
    }
}

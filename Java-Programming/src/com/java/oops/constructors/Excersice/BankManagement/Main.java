package com.java.oops.constructors.Excersice.BankManagement;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();        // using constructor without argument
        bankAccount.displayInfo();              //method without return type and without parameters

        BankAccount bankAccount1=new BankAccount("9514624421",1500.152);    // using constructor with argument
        bankAccount1.displayInfo();             //method without return type and without parameters

    }
}

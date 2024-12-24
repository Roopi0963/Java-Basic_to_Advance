package com.java.oops.constructors.Excersice.BankManagement;

public class BankAccount {
    String accountNumber;
    double balance;

    static String BankName="Canara Bank";


    BankAccount(){
        accountNumber="Unkown";
        balance=0.0;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    static void BankName(){
        System.out.println("Bank Name : "+BankName);
    }

    void displayInfo(){
        BankName();
        System.out.println("Account No : "+accountNumber);
        System.out.println("Balance : "+balance);
    }

}

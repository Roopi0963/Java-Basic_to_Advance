package com.java.Features.Inheritance.LibraryManagement;

public class LibraryTest {
    public static void main(String[] args) {
        EBook ebook=new EBook("Rupee","Krish",123.32);
        PrintedBooks printedBooks=new PrintedBooks("Krish","RAvan",963);

        System.out.println("EBook Details : ");
        ebook.displayInfo();

        System.out.println("Printed details");
        printedBooks.displayInfo();
    }

}

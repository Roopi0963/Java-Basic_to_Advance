package com.java.Features.Inheritance.LibraryManagement;

public class Book {
    String author;
    String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void displayInfo(){
        System.out.println("Name of the book is : "+title);
        System.out.println("Author of the book is : "+author);
    }
}

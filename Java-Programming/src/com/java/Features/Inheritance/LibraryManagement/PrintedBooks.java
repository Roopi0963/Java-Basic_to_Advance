package com.java.Features.Inheritance.LibraryManagement;

public class PrintedBooks extends Book{
    int numPages;

    public PrintedBooks(String author, String title, int numPages) {
        super(author, title);
        this.numPages = numPages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of pages were printed : "+numPages);
    }


}

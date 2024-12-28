package com.java.Features.Inheritance.LibraryManagement;

public class EBook extends Book{

    double fileSize;

    public EBook(String author, String title, double fileSize) {
        super(author, title);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The file size is : "+fileSize);
    }

}

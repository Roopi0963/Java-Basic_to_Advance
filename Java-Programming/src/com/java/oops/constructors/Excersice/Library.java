package com.java.oops.constructors.Excersice;

public class Library {
    String bookName;
    String author;

    static String getLibraryName ="My Library";

    Library(){
        bookName="BagavatGita";
        author="APY";
    }

    Library(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    void displayBookInfo(){
        System.out.println("Name of the book is : " +bookName);
        System.out.println("Author of the book : "+author);
    }

}

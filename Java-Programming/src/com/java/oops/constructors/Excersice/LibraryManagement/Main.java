package com.java.oops.constructors.Excersice.LibraryManagement;

public class Main {
    public static void main(String[] args) {
        Library library;
        library=new Library();
        library.displayBookInfo();

        Library library1;
        library1=new Library("Bible","APY");
        library1.displayBookInfo();


    }
}

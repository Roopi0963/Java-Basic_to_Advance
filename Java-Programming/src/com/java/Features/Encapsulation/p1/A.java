package com.java.Features.Encapsulation.p1;

public class A {
//    int val=100; //it can be accessed only in this package

    public int val=100; // It can be accessed within the package and other package as well

    /*
        Access modifiers are 5 types
            1.Accessing within the same class
            2.Accessing within the same package
            3.Accessing subclass of same package
            4.Accessing other class from other package
            5.Accessing subclass of other package
     */

    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.val);
    }
}

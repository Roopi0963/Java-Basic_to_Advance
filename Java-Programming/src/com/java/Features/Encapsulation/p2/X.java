package com.java.Features.Encapsulation.p2;

import com.java.Features.Encapsulation.p1.A;

public class X {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.val); // here it is access form other package
    }
}

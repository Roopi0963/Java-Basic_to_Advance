package com.java.Features.Encapsulation.p2;

import com.java.Features.Encapsulation.p1.A;

public class Y extends A {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.val);  // it extended from other package accessed from parent class

    }
}

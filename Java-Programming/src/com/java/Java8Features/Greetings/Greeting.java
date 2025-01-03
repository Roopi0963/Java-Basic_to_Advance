package com.java.Java8Features.Greetings;

public class Greeting implements Greet{
    @Override
    public void greet() {
        System.out.println("Hello ! Welcome");

    }

    @Override
    public void greeting(String msg) {
        System.out.println(msg);

    }
}

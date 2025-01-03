package com.java.Java8Features.Greetings;

public class Main {
    public static void main(String[] args) {

        Greeting greets=new Greeting();
        greets.greet();
        greets.greeting("How are you ? ");


        /*
            1. Anonymous inner class
            2. Create objects to the inner class
         */


        Greet greet=new Greet() {
            @Override
            public void greet() {
                System.out.println("Hello ! Welcome anonymous class");

            }

            @Override
            public void greeting(String msg) {
                System.out.println(msg+" Anonymous class");

            }
        };

        greet.greet();
        greet.greeting("Welcome");
    }
}

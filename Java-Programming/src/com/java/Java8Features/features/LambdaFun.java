package com.java.Java8Features.features;

public class lambdaFunction {
    public static void main(String[] args) {
        /*
            1. Lambda Expression
            2. It is the implementation for the functional interface(Instances of functional interface)
            3. syntax
         */

        /*
            Implementation

            () -> {Logic}
         */

        FunInterface funInterface = () -> System.out.println("Functional interface implementing using lambda expression");
        funInterface.getDetails();



        /*
            Using anonymous inner class
         */
        FunInterface funInterface1=new FunInterface() {
            @Override
            public void getDetails() {
                System.out.println("Using anonymous inner class");
            }
        };
        funInterface1.getDetails();




    }
}

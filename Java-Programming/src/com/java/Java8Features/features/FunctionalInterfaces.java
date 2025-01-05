package com.java.Java8Features.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        // Predicates
        // To check even or odd

        Predicate<Integer> isEvenPredicate= num -> num % 2 ==0;
        System.out.println(isEvenPredicate.test(100));


        // Consumer
        // Logic building
        //accept(object)

        List<String>  customersName = Arrays.asList("Krish","Roopi","Ravan","Lovely");
        Consumer<String> printCustomerNames = name -> System.out.println(name);
        customersName.forEach(printCustomerNames);


    }
}

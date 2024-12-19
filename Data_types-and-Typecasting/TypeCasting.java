package com.training.java;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        Implicit type conversion :-> Integer to Float
                                     Low Memory to High Memory

         Explicit type conversion :-> (int)age;
         */

        byte age;
        age = 22;
        int ageValue;
        ageValue=age;

        int value;
        float age1;
        age1=2213.123f;
        value=(int)age1;
        System.out.println(value);

        int val;
        val=(int)age;
        System.out.println(val);

    }
}

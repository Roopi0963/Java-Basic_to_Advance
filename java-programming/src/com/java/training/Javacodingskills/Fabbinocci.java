package com.java.Javacodingskills;

public class Fabbinocci {
    public static void main(String[] args) {
        int num1=1;
        int num2=2;
        System.out.println(num1);
        while(num2<=1000){
            int sum=num1+num2;
            num1=num2;
            num2=sum;

            if(sum>1000){
                break;
            }

            System.out.println(num2);
        }
    }
}

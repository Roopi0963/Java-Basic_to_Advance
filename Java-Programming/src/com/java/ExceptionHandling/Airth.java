package com.java.ExceptionHandling;

public class Airth {

    int a;
    int b;

    public Airth(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int getDivisible(int a,int b){
        try{
            int res = a/b;
            return res;
        }catch (ArithmeticException e){
            System.out.println("Please enter valid number");
            return 0;
        }


    }

    public static void main(String[] args) {
        Airth airth=new Airth(8,0);
        double re=airth.getDivisible(8,0);
    }

}

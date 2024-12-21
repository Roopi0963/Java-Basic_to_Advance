package com.java.conditionalstatements;

public class conditionalStatements {

    public static void main(String[] args) {
        /*
        Discount calculating
        coustomer membership = diamond =20%
        G = 15%
        Silver = 10%
        others = 5%

         */
        int productprice;
        int discount;
        productprice=1000;
        char membership='D';
        System.out.println(" Price of the product is "+productprice);
        if(membership=='D'){
            discount=20;
            System.out.println(discount+"% discount");
        }
        else if(membership=='E'){
            discount=15;
            System.out.println(discount+"% discount");
        }
        else if(membership=='S'){
            discount=10;
            System.out.println(discount+"% discount");
        }
        else{
            discount=5;
            System.out.println(discount+"% discount");
        }
        int discountPrice= productprice * discount/100;
        System.out.println("overall discount is " + discountPrice);
    }
}

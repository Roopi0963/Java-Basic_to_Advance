package com.java.CollectionFrameworks;

import java.util.HashSet;

public class SetImplementation {
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet<>();

        hashset.add("Rupee");
        hashset.add("Krish");               // add() is used to add elements into the hashset
        System.out.println(hashset.size());  //  size() is used to print size of hashset
        System.out.println(hashset);        // hashset is used to print whole hashset
        for(String str :hashset){
            System.out.println(str);
        }


    }
}

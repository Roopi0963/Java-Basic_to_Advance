package com.java.CollectionFrameworks;

import java.util.TreeSet;

public class Collection {
    public static void main(String[] args) {
        TreeSet<String> set =new TreeSet<>(); // Linkedhashset is an ordered data structure

        set.add("Rupee");
        set.add("Ravan");
        set.add("Lovely");
        set.add("prabhu");
        set.add("Krish");               // add() is used to add elements into the hashset
        System.out.println(set.size());  //  size() is used to print size of hashset
        System.out.println(set);        // hashset is used to print whole hashset
        for(String str :set){
            System.out.println(str);
        }
    }
}

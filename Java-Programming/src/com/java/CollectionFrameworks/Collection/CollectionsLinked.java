package com.java.CollectionFrameworks;


import java.util.HashSet;
import java.util.LinkedHashSet;

public class CollectionsLinked {
    public static void main(String[] args) {
        LinkedHashSet<String> hashset = new LinkedHashSet<>(); // Linkedhashset is an ordered data structure

        hashset.add("Rupee");
       hashset.add("Ravan");
       hashset.add("Lovely");
       hashset.add("prabhu");
        hashset.add("Krish");               // add() is used to add elements into the hashset
        System.out.println(hashset.size());  //  size() is used to print size of hashset
        System.out.println(hashset);        // hashset is used to print whole hashset
        for(String str :hashset){
            System.out.println(str);
        }


    }


}

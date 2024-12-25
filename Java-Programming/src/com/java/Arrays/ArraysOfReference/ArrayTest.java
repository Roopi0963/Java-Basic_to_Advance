package com.java.Arrays.ArraysOfReference;

public class ArrayTest {
    public static void main(String[] args) {
        // Arrays are objects in java.

        //  1.Array Declaration
        int[] ids; // Reference variable (No array will be created)

        //  2.Array instantiation(Creating an object)
        ids = new int[5];

        //  3.Initialize the array
        ids[0]=11;
        ids[1]=22;
        ids[2]=33;
        ids[3]=44;
        ids[4]=44;
        System.out.println(ids[2]);


        //Shortcut to create array
        byte[] marks={11, 22, 33, 45, 87, 89, 56, 79};
        int n= marks.length;



        // 4.Accessing elements
        byte[] rev=new byte[n];
        for(int i=0;i< marks.length;i++) {          //Manipilition
            marks[i] += 5;
            System.out.print(marks[i] + ",  ");
        }
        // For-Each
        // for each mark in marks

        byte[] sample={11, 22, 33, 45, 87, 89, 56, 79};
        int u= marks.length;
        for(byte samp : sample){
            System.out.println(samp);
        }




          
    }
}

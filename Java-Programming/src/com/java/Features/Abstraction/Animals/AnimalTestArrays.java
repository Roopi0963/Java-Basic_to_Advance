package com.java.Features.Abstraction.Animals;

import java.util.Scanner;

public class AnimalTestArrays {
    public static void main(String[] args) {
        Dog[] dog;
        Scanner sc=new Scanner(System.in);
        System.out.print("No of animials : ");
        int n=sc.nextInt();
        sc.nextLine();
        dog=new Dog[n];
        System.out.println("Animals that walk on the earth");
//        dog.move();
//        dog.makeSound();
//        System.out.println("------------------------------------------------------------");

        for(int i=0;i<n;i++){
            System.out.println("Enter the animal details : ");

            System.out.print("Name : ");
            String name;
            name=sc.nextLine();

            int age;
            //age=sc.nextInt();
            while (true) { // Loop until a valid integer is entered
                System.out.print("Age: ");
                if (sc.hasNextInt()) {
                    age = sc.nextInt();
                    sc.nextLine(); // Consume the newline character
                    break; // Exit loop if valid input is provided
                } else {
                    System.out.println("Invalid input. Please enter a valid integer for age.");
                    sc.nextLine(); // Clear invalid input
                }
            }

            dog[i]=new Dog(name,age);
        }

        // Display employee details
        System.out.println("\nAnimal Details:");
        for (Dog d : dog) {
            d.move();
            d.makeSound();


            System.out.println("---------------------");
        }


        Birds[] birds;
//        System.out.println("Birds that fly in the sky");
//        birds.move();
//        birds.makeSound();

        System.out.println("No of birds : ");
        int m=sc.nextInt();
        sc.nextLine();
        birds=new Birds[m];

        for(int i=0;i<m;i++){
            System.out.print("Enter details : ");
            System.out.print("Name : ");
            String name=sc.nextLine();


            int age;
            while(true){
                // Loop until a valid integer is entered
                System.out.print("Age: ");
                if (sc.hasNextInt()) {
                    age = sc.nextInt();
                    sc.nextLine(); // Consume the newline character
                    break; // Exit loop if valid input is provided
                } else {
                    System.out.println("Invalid input. Please enter a valid integer for age.");
                    sc.nextLine(); // Clear invalid input
                }

            }
            birds[i] = new Birds(name,age);
        }
        System.out.println("\nBirds details : ");
        for(Birds b:birds){
            b.makeSound();
            b.move();
            System.out.println("---------------------");
        }
    }

}

package com.java.Features.Abstraction.Animals;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog=new Dog("Dog",21);
        System.out.println("Animals that walk on the earth");
        dog.move();
        dog.makeSound();
        System.out.println("------------------------------------------------------------");

        Birds birds=new Birds("Pegion",12);
        System.out.println("Birds that fly in the sky");
        birds.move();
        birds.makeSound();
    }

}

package com.java.Features.Abstraction.Animals;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Bow Bow");
    }

    @Override
    void move() {
        System.out.println("Walks on the earth");

    }
}

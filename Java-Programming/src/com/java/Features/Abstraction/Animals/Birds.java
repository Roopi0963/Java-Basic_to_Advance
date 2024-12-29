package com.java.Features.Abstraction.Animals;

public class Birds extends Animal{
    public Birds(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Keee Keeee");
    }

    @Override
    void move() {
        System.out.println("Fly's in the sky");

    }
}

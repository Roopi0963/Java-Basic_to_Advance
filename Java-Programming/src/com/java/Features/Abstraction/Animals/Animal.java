package com.java.Features.Abstraction.Animals;

public abstract class Animal extends Animals{

    public Animal(String name, int age) {
        super(name, age);
    }

    abstract void makeSound();

    abstract void move();
}

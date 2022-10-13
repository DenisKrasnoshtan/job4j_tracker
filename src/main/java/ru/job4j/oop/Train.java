package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("The train rides on the rails");

    }

    @Override
    public void speed() {
        System.out.println("Maximum speed 250 km per hour");
    }
}

package ru.job4j.oop;

public class Bus implements Vehicle{
    @Override
    public void move() {
        System.out.println("The bus is traveling on the road");
    }

    @Override
    public void speed() {
        System.out.println("Maximum speed 100 km per hour");
    }
}

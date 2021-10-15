package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Go");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Passengers numbers: " + count);
    }

    @Override
    public double refuel(double liters) {
        double gas = 45.5;
        return liters * gas;
    }
}

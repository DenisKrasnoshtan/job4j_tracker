package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;

    }

    public static void main(String[] args) {
        Battery iphoneBattery = new Battery(40);
        Battery charger = new Battery(60);
        charger.exchange(iphoneBattery);
        System.out.println("IphoneBattery: " + iphoneBattery.load + ". Charger: " + charger.load);
    }

}

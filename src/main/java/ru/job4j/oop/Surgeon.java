package ru.job4j.oop;

public class Surgeon extends Doctor {
    private String specialName;

    public Surgeon(String name, String surname, String education,
                   int birthday, String specialName) {
        super(name, surname, education, birthday);
        this.specialName = specialName;
    }

    public String getSpecialName() {
        return specialName;
    }
}

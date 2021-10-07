package ru.job4j.oop;

public class Builder extends Engineer {
    private String building;

    public Builder(String name, String surname, String education, int birthday, String building) {
        super(name, surname, education, birthday);
        this.building = building;
    }

    public String getBuilding() {
        return building;
    }
}

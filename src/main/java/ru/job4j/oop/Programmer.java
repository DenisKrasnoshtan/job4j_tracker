package ru.job4j.oop;

public class Programmer extends Engineer {
    private String language;
    private int salary;
    private String computer;

    public Programmer(String name, String surname, String education, int birthday, String language, int salary, String computer) {
        super(name, surname, education, birthday);
        this.language = language;
        this.salary = salary;
        this.computer = computer;
    }

    public String getComputer() {
        return computer;
    }

    public int getSalary() {
        return salary;
    }

    public String getLanguage() {
        return language;
    }
}

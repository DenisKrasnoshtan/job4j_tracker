package ru.job4j.oop;

public class Dentist extends Doctor {
    private String speciality;
    private String salary;

    public Dentist(String name, String surname, String education, int birthday, String speciality, String salary) {
        super(name, surname, education, birthday);
        this.speciality = speciality;
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public String getSpeciality() {
        return speciality;
    }
}

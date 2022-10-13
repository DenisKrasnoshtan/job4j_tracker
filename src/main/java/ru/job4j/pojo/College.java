package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Красноштан Денис Константинович");
        student.setGroup("14Ю");
        student.setDateOfReceipt("01.09.2021");
        System.out.println("ФИО: " + student.getName() + System.lineSeparator()
                + "Группа: " + student.getGroup()
                + System.lineSeparator() + "Дата поступления: " + student.getDateOfReceipt());
    }

}

package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error arithmeticException = new Error();
        arithmeticException.printInfo();
        Error arrayIndexOutOfBoundsException = new Error(true, 1243, " ArrayIndexOutOfBoundsException");
        arrayIndexOutOfBoundsException.printInfo();
        Error classCastException = new Error(true, 2042, "ClassCastException");
        classCastException.printInfo();
    }
}

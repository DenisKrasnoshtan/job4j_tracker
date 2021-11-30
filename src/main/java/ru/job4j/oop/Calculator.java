package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultSum = sum(10);
        System.out.println(resultSum);
        int resultMultiply = calculator.multiply(10);
        System.out.println(resultMultiply);
        int resultMinus = minus(10);
        System.out.println(resultMinus);
        int resultDivide = calculator.divide(10);
        System.out.println(resultDivide);
        int resultSumAllOperation = calculator.sumAllOperation(10);
        System.out.println(resultSumAllOperation);
    }
}

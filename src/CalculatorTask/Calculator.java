package CalculatorTask;

public class Calculator {
    public static void add(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void add(int a, double b) {
        int result = (int) Math.round(a + b);
        System.out.println(result);
    }

    public static void add(double a, double b) {
        double result = a + b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        add(1, 1);
        add(1.6, 1);
        add(1.6, 2.5);
    }
 }
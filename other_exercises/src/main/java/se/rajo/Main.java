package se.rajo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Calcualtor!");

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.add(1, 5);

        calculator.divide(10, 2);
    }
}
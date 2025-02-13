package se.rajo;

public class SimpleCalculator {

    public int add (int a, int b){
        return a + b;
    }
    public int subtract (int a, int b){
        return a - b;
    }
    public int multiply (int a, int b){
        return a * b;
    }
    public int divide (int a, int b){
        if (b == 0){
            System.out.println("Can't divide by zero!");
        }
        return a / b;
    }

}

package se.dsve;

public class Car {
    // Använder standark-kontruktorn
    String brand;
    String model;
    int year;
    int speed;

    void startEngine() {
        System.out.println("Engine started");
    }

    void accelerate() {
        speed += 10;
        System.out.println("Speed = " + speed);
    }
}

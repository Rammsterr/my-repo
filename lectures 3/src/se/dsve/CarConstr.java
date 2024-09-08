package se.dsve;

public class CarConstr {
    String brand;
    String model;
    int year;
    int speed = 13;

    //Konstruktor med 3 argument
    public CarConstr(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //Konstruktor med 2 argument
    public CarConstr(String brand, String model){
        this(brand, model, 2020);
    }

    //Konstruktor utan argument
    public CarConstr(){
        this("Unknown", "Unknown", 0);
    }

    void carInfo(){
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year + ",  Speed: " + speed);
    }

}

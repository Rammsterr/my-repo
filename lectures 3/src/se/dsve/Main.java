package se.dsve;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("Main");

        Car car1 = new Car();
        car1.startEngine();
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);

        car1.brand = "Volvo";
        car1.model = "V90";
        car1.year = 2024;
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);

        car1.brand = "Tesla";
        System.out.println(car1.brand);

        car1.accelerate();
        car1.accelerate();*/

        /*System.out.println("Main Book");

       Book book = new Book();
       book.title = "Sagan om ringen";
       book.author = "J.R.R. Tolkien";
       book.printTitleAndAuthor();



        CarConstr car2 = new CarConstr( "Mazda",  "323",  1994);
        System.out.println(car2.model);
        System.out.println(car2.brand);
        System.out.println(car2.year);


        CarConstr car3 = new CarConstr( "Nissan", "323", 1994);
        System.out.println(car3.brand);
        System.out.println(car3.model);
        System.out.println(car3.year);


        CarConstr car4 = new CarConstr();
        System.out.println(car4.brand);
        car2.carInfo();
        car3.carInfo();
        car4.carInfo();*/

        /*Person person = new Person("Johan",30, "johan.ramsenius@hotmail.com");
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.email);*/

      /*  System.out.println("Hund");
        System.out.println("-----------------");

        Dog dog = new Dog("Hjalle", 4); // människoår

        Dog replikaDog1 = new Dog("Sven", 5);
        Dog replikaDog2 = dog;

        replikaDog2.name ="Hasse";
        replikaDog1.name ="Lassie";

        dog.bark();
        replikaDog1.bark();
        replikaDog2.bark();
        dog.SkrivUtHundData();*/

        System.out.println("-----------HUS-------------");

        House house = new House("Bondevägen", "Röd");
        System.out.println(house.adress);

        System.out.println("----------------------");
        System.out.println("Ursprunglig färg: " + house.color);

        repaintHouse housePainter = new repaintHouse();
        housePainter.paintHouse(house, "Blå");
        System.out.println("Nya färgen: " + house.color);






    }



}
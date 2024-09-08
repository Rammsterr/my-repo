package se.dsve;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

     void bark(){
        System.out.println( name + " sa voff voff!");
    }
    public void SkrivUtHundData(){
        System.out.println(name + " är " + age*7 + " år gammal");
    }
}

// TIPS: Fråga Lars om Lombok


package Person;

public class Person {
    String name;
    int age;
    String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        if(age < 0) {

            throw new IllegalArgumentException("Age can't be negative");
        }
    }

    public Person (String name, int age) {
        this (name, age, "unknown@example.com");
    }

    public Person(){
        this("unknown", 0, "unknown@example.com");
    }




}




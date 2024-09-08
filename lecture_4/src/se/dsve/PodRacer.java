package se.dsve;

public class PodRacer {
    private String name;
    private int speed;
    private int integrity;

    public PodRacer(String name, int speed, int integrity) {
        this.name = name;
        this.speed = speed;
        this.integrity = integrity;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getIntegrity() {
        return integrity;
    }

    public void speedBoost (int amount){
        if (isFunctional()){
            speed += amount;
            System.out.println(name + " uses boost and increase their speed to " + speed + "km/h");
        } else {
            System.out.println(name + " is broken and can't use boost!");
        }
    }

    public void takeDamage(int amount){
        integrity -= amount;
        if(isFunctional()){
            System.out.println(name + " took damage! The integrity is now: "+ integrity + "/100.");
        } else {
            integrity = 0;
        }

    }

    public boolean isFunctional(){
        return integrity > 0;
    }

    public void status(){
        System.out.println(name + ", speed:" + speed + ", integrity:" + integrity);
    }
}

package se.dsve;

public class Race {
    private PodRacer racer1;
    private PodRacer racer2;
    private PodRacer racer3;

    public Race(PodRacer racer1, PodRacer racer2, PodRacer racer3) {
        this.racer1 = racer1;
        this.racer2 = racer2;
        this.racer3 = racer3;

    }

    public void startRace(){
        System.out.println("Start podrace between " + racer1.getName() + " and " + racer2.getName() + "and " + racer3.getName());
        int round =1;

        while (racer1.isFunctional() && racer2.isFunctional() && racer3.isFunctional()){
            System.out.println("---- Round ----" + round + "----");

            racer1.speedBoost(Helper.randomInt());
            racer2.speedBoost(Helper.randomInt());
            racer3.speedBoost(Helper.randomInt());

            racer1.takeDamage(Helper.randomInt());
            racer2.takeDamage(Helper.randomInt());
            racer3.takeDamage(Helper.randomInt());

            racer1.status();
            racer2.status();
            racer3.status();

            round++;

            if (round > 100){
                break;

            }
        }

        //Kontrollera vem som vann
        if (!racer1.isFunctional() && !racer2.isFunctional() && !racer3.isFunctional()){
            System.out.println("All Podracers have crashed! Nobody wins!");
        } else if (!racer1.isFunctional()){
            System.out.println(racer1.getName() + " have crashed!" + racer2.getName() + " win the race!");
        } else if (racer2.isFunctional()){
            System.out.println(racer2.getName() + " have crashed!" + racer1.getName() + " win the race!");
        }
    }
}

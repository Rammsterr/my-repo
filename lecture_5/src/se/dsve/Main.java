package se.dsve;


import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Lektion 5");

        System.out.println("Övningar 5");

        System.out.println("Team/Player");

        Team team = new Team(3);

        team.listPlayers();



















        /*System.out.println("Arrays");

        int[] numbers = {21, 44, 3, 1, 9};
        System.out.println("Numbers before sorting: ");
        for(int number : numbers) {
            System.out.println(number + " ");
        }

        bubbleSort(numbers);

        System.out.println("Numbers after sorting: ");
        for(int number : numbers) {
            System.out.println(number + " ");
        }*/



        //arrayList();

        /*int [] numbers;
        numbers = new int[10];

        // Fyll på med nummer
        numbers[0] = 10;
        numbers[1] = 850;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        System.out.println("numbers.length: " + numbers.length);

        //for (int i = 0; i < 5; i++) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Max: " + max);*/



    }

    public class Player{
        private String name;

        public Player(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
    public class Team{
        private Player[] players;
        private int playerCount;

        public Team(int size) {
            players = new Player[size];
            playerCount = 0;
        }
        public void addPlayer(Player player) {
            if(playerCount < players.length){
                players[playerCount] = player;
                playerCount++;
            }

        }
        public void listPlayers() {
            for (int i = 0; i < playerCount; i++) {
                System.out.println(players[i].getName());

            }
        }
    }

    /*private static int[] bubbleSort(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }

        }
        return numbers;


    }*/


  /*  private static void arrayList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(300);
        numbers.add(1000);
        numbers.add(41);
        numbers.add(5);


        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }





        }*/
    }
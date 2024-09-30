package exercises4;



public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hantering av persondata :)");

        Person person1 = new Person();
        person1.setName("Erik");
        person1.setAge(27);
        person1.setCity("Sturefors");

        Person person2 = new Person();
        person2.setName("Johan");
        person2.setAge(30);
        person2.setCity("Karlskoga");

        Person person3 = new Person();
        person3.setName("Christer");
        person3.setAge(61);
        person3.setCity("Karlskoga");

        Person person4 = new Person();
        person4.setName("Maria");
        person4.setAge(59);
        person4.setCity("Karlskoga");



        System.out.println("-------------PersonInfo: ----------------------");

        System.out.println(person1.getInfo());
        System.out.println(person2.getInfo());
        System.out.println(person3.getInfo());
        System.out.println(person4.getInfo());

        System.out.println("------------------------MiniRäknare-------------------");

        SimpleCalculator calculator = new SimpleCalculator();

        System.out.println(calculator.add(10,5));
        System.out.println(calculator.subtract(10,5));
        System.out.println(calculator.multiply(10,5));
        System.out.println(calculator.divide(10,5));*/

        System.out.println("----------------ARRAYS----------------");

            /*int [] numbers = {10, 50, 70, 90, 110};
            int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("totala summan av alla tal " + sum);
        double average = sum / numbers.length;
        System.out.println("Medelvärdet: " + average);*/

        int[] numbers = {51, 12, 99, 30, 77};

        int max = findMax(numbers);
        int min = findMin(numbers);




        }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                System.out.println(max);
            }
        } return max;
    }
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                System.out.println(min);
            }
        } return min;


    }




}

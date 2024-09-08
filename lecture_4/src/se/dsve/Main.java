package se.dsve;


public class Main {
    public static void main(String[] args) {
       String name = "Nisse";
        printLars();
        printHello(name);
        String text = returnText( "David");
        System.out.println(text);
        System.out.println(returnText("Jesper"));
        System.out.println(addTwoNumbers(3, 5));

        System.out.println("----  Bank  --------");
        BankAccount account = new BankAccount();
        account.getBalance();
        account.deposit(1000);
        account.deposit(1000);
        account.deposit(-999);
        account.withdraw(100);
        account.withdraw(100);


        exampleDemo();

        recursion();

        int[] arr = {1,2,3,4,5};
        int sum = sumArray(arr,3);
        System.out.println(sum);

        System.out.println(Helper.randomInt());

        racing();



        /*System.out.println(account.balance);
        account.balance -= 1000;
        System.out.println(account.balance);*/
        // Svart låda
    }

    private static void racing() {
        //Skapat två racers
        PodRacer anakin = new PodRacer("Anakin Skywalker", 300, 100);
        PodRacer sebulba = new PodRacer("Sebulba", 200, 100);

        // skapa race
        Race race = new Race(anakin, sebulba);
        race.startRace();
    }

    public static int sumArray (int [] arr, int n){
        if (n <= 0){
            return 0;
        } else {
            return arr[n -1] + sumArray(arr, n-1);
        }

    }



    private static void recursion() {
        System.out.println("Recursion");
        System.out.println("n = 5 => 5! => 5*4*3*2*1 returnerar resultatet av operationen = 120");
        System.out.println("factorial(0): " + factorial(0));
        System.out.println("factorial(1): " + factorial(1));
        System.out.println("factorial(2): " + factorial(2));
        System.out.println("factorial(3): " + factorial(3));
        System.out.println("factorial(4): " + factorial(4));
        System.out.println("factorial(5): " + factorial(5));
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


    private static void exampleDemo() {
        ExampleClass exampleClass = new ExampleClass();
        System.out.println(exampleClass.packageNum);
        System.out.println(exampleClass.protectedVar);
        System.out.println(exampleClass.publicInt);
        System.out.println(exampleClass.getPrivateNumber());


    }

    public static void printLars(){
        System.out.println("Hej, Lars");

    }
// Svart låda som tar emot en string
    public static void printHello(String name){
        System.out.println("Hej " + name);
    }

    // Svart låda som tar emot en string och returnerar en string
    public static String returnText(String name){
       // String text = "Hej " + name;

       // return text;
        return "Hej " + name;
    }

    // addera två tal
    public static int addTwoNumbers(int num1, int num2){
        return num1 + num2;
    }





}
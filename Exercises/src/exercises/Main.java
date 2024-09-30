package exercises;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Abstraktion");













        /*System.out.println("Polymorfism");
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(5,5));
        System.out.println(calculator.multiply(6.7,6.7));
        System.out.println("-------------------------------------");
        System.out.println("---------------------------------------");

        Shape myCircle = new Circle();
        Shape myRectangle = new Rectangle();
        Shape shape = new Shape();

        shape.draw();
        myCircle.draw();
        myRectangle.draw();*/










       /* Book book = new Book("Sagan om ringen", "J.R.R Tolkien", 1200);
        book.printBook();
        book.calculateReadingTime();
        System.out.println("------------------------------------------------------------");

        Book book1 = new Book("Harry Potter och de vises sten", "J.K Rowling", 256);
        book1.printBook();
        book1.calculateReadingTime();
        System.out.println("-------------------------------------------------------------");

        Book book2 = new Book("Wallander", "Henning Mankell", 80);
        book2.printBook();
        book2.calculateReadingTime();
        System.out.println("--------------------------------------------------------------");*/

















        /*String author = "Author: J.R.R Tolkien";
        System.out.println(author);

        int pages = 400;
        System.out.println(pages + " pages");

        double price = 129.00;
        System.out.println("Price: " + price);

        System.out.print("Bound: ");
        boolean isBound = false;
        System.out.println(isBound);*/

        /*System.out.println("--------------------------------");

        System.out.println("Uppgift 1.2");

        Scanner input = new Scanner(System.in);

        System.out.print("Ange längd på sida 1 (cm): ");
        double side1 = input.nextDouble();
        System.out.print("Ange längd på sida 2(cm) : ");
        double side2 = input.nextDouble();
        double circumference = (side1 + side2) * 2;
        System.out.println("Omkretsen är " + circumference + "cm");


        System.out.print("Ange basens längd (cm): ");
        double base = input.nextDouble();
        System.out.print("Ange höjdens längd (cm): ");
        double height = input.nextDouble();
        double area = base*height;
        System.out.print("Arean är: " + area + "cm2");*/

       /* System.out.println("----------------------------------");

        System.out.println("Uppgift FAHRENHEIT");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange temperatur i Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 1.8 + 32;
        System.out.println(celsius + " grader Celsius är lika med " + fahrenheit + " grader Fahrenheit.");
        scanner.close();*/

        /*System.out.println("-----------------------");
        System.out.println("Beräkna minuter och sekunder");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange sekunder: ");
        int totalSeconds = scanner.nextInt();

        int min = totalSeconds / 60;
        int sec = totalSeconds % 60;

        System.out.println(totalSeconds + " Det blir: " + min + "minuter och " + sec + "sekunder");

        scanner.close();*/

       /* System.out.println("Blir det något lån? Vem vet...");
        System.out.println("-----------------------");


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange din ålder: ");
        int age = scanner.nextInt();

        System.out.print("Ange din månadsinkomst före skatt: ");
        double salary = scanner.nextDouble();

        System.out.print("Ange din kreditpoäng: ");
        int creditScore = scanner.nextInt();

        boolean cleardForLoan = (age >= 18) && (salary >=18000) && creditScore >= 650;

        if (cleardForLoan) {
            System.out.println("Whohoo du får låna pengar!");
        } else {
            System.out.println("Tyvärr, du är inte berättigad till lånet.");
        }
        scanner.close();
*/

      /*  System.out.println("--------------------------------");

        System.out.println("STUDENTBETYG");
        System.out.println("-------------------------");

        Scanner input = new Scanner(System.in);

        System.out.print("Ange din poäng (1-100): ");
        int score = input.nextInt();

        if(score <=20){
            System.out.println("Ditt betyg: F");
        } else if(score >= 21 && score <= 30) {
            System.out.println("Ditt betyg: E");

        } else if(score >= 31 && score <= 40){
            System.out.println("Ditt betyg: D");

        } else if(score >= 41 && score <= 50){
            System.out.println("Ditt betyg: C");
        } else if(score >= 51 && score <= 60){
            System.out.println("Ditt betyg: B");
        } else if(score >= 61 && score <= 100){
            System.out.println("Ditt betyg: A");
        }
        System.out.println("Välkommen åter!");*/

       /* System.out.println("---------------------------");
        System.out.println("----------------------------");

        System.out.print("Skriv in ett årtal: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println( year +" Skottår.");
        }  else {
            System.out.println(year + " Inte skottår.");
        }
        scanner.close();*/

       /* System.out.println("--------------");
        System.out.println("--------------");

        System.out.print("Ange en veckodag: ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine().toLowerCase();

        switch (day) {
            case "måndag":
                System.out.println("Gym");
                break;
            case "tisdag":
                System.out.println("Handla matvaror");
                break;
            case "onsdag":
                System.out.println("Plugga");
                break;
            case "torsdag":
                System.out.println("Gym");
                break;
            case "fredag":
                System.out.println("Badhuset");
                break;
            case "lördag":
                System.out.println("Vila/fest");
                break;
            case "söndag":
                System.out.println("Förbereda mat inför veckan");
                break;
                default:
                    System.out.println("Ogiltig dag, försök");
                    break;
        }*/

       /* System.out.println("--------------------");
        System.out.println("--------------------");

        System.out.println("Miniräknare");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange ditt första tal: ");
        double nr1 = scanner.nextDouble();

        System.out.print("Ange ditt andra tal:");
        double nr2 = scanner.nextDouble();

        System.out.print("Skriv in vilken operation du vill utföra (addition, subtraktion, multiplikation, division: ");
        String operation = scanner.next().toLowerCase();

        switch (operation) {
            case "addition":
                System.out.println("Resultat: " + (nr1 + nr2));
                break;
                case "subtraktion":
                    System.out.println("Resultat: " + (nr1 - nr2));
                    break;
                    case "multiplikation":
                        System.out.println("Resultat: " + (nr1 * nr2));
                        break;
                        case "division":
                            if(nr2 !=0){
                                System.out.println("Resultat: " + (nr1 / nr2));
                            } else {
                                System.out.println("Division med siffran noll är inte tillåtet.");
                            }
                            break;
                            default:
                                System.out.println("Ogiltig operation! Försök igen.");

        }*/

       /* System.out.println("--------------------");
        System.out.println("---------------------");

        System.out.println("FOR-LOOP");

        for (int i = 1; i <= 100; i++) {
            if (i % 3== 0 && i % 5 == 0)
            System.out.println(i);

        }*/

      /*  System.out.println("---------------------------");
        System.out.println("---------------------------");

        System.out.print("Skriv in talet du vill ha fakulteten av: ");
        Scanner input = new Scanner(System.in);
        int nr = input.nextInt();
        int factorial = 1;

        for (int i = 1; i <= nr; i++) {
            factorial *= i;
            System.out.println("Fakulteten av " + nr + " är: " + factorial);


        }*/

        /*System.out.println("--------------------------");
        System.out.println("---------------------------");

        System.out.print("Ange ett heltal: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int wholeNumber = 0;
        int actualNumber = 2;

        while(actualNumber <= number){
            wholeNumber += actualNumber;
            actualNumber +=2;

        }
        System.out.println("Summan av alla jämna tal mellan 1 och " + number + " är " + wholeNumber);*/


        System.out.println("Hello World");
        System.out.println("Trevlig Helg!");




























    }
}
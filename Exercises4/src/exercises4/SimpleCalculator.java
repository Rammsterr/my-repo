package exercises4;

public class SimpleCalculator {
    public int add(int a, int b){
    return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public double divide(int a, int b){
        if(b == 0){
            System.out.println("ERROR: You can't divide by zero");
            return 0;
        }
        return a/b;
    }
}

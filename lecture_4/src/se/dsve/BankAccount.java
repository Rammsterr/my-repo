package se.dsve;

public class BankAccount {
    private double balance;

    public void getBalance(){
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("New balance: " + balance);
        } else{
            System.out.println("Deposit can't be negative, rejected!");
            getBalance();
        }

    }

    public void withdraw(double amount){
        if(balance < amount || amount < 0){
            System.out.println("Not enough money to withdraw or amount is less then zero");

        } else if(amount < 0) {
            System.out.println("Withdraw can't be negative, rejected!");


        } else {
            balance -= amount;
            getBalance();
        }
    }

}

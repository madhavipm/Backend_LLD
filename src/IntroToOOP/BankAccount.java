package IntroToOOP;

import java.util.ArrayList;

public class BankAccount {
    private String ownerName;
    private double balance;
    ArrayList<String> transactionHistory;
    BankAccount(String ownerName, double balance) {
        this.balance = balance;
        this.ownerName = ownerName;
    }
    BankAccount(BankAccount other) {
        this.ownerName = other.ownerName;
        this.balance = other.balance;
    }
    BankAccount() {
        this.ownerName = "";
        this.balance = 0;
    }
    void deposit(double amount) {
        balance += amount;
        transactionHistory = new ArrayList<>();
        transactionHistory.add("Deposit successful " + amount+" Total balance = "
        + balance);

        System.out.println("deposit successful for: " + amount);
        System.out.println("Current balance is: " + balance);
    }
    void withdraw(double amount) {
        if(balance < amount) {
            System.out.println("Insufficient Balance");
        }
        else {
            balance -= amount;
            System.out.println("Withdraw successful " + amount);
            System.out.println("Balance left is: " + balance);
        }
    }
    void history(){
        for(int i = 0; i < transactionHistory.size(); i++) {
            System.out.println(transactionHistory.get(i));
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

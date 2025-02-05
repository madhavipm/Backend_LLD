package IntroToOOP;

public class Client {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Madhavi",5600);
        bankAccount.deposit(5000);
        bankAccount.withdraw(1000);
        bankAccount.history();
    }
}

package BankAccountThreads;

import java.util.concurrent.Callable;

public class Deposits implements Callable<Void> {
    private BankAccount bankAccount;

    public Deposits(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void deposit() {
        for (int i = 0; i < 100000; i++) {
            bankAccount.setBalance(bankAccount.getBalance() - i);
        }
    }

    @Override
    public Void call() throws Exception {
        deposit();
        return null;
    }
}

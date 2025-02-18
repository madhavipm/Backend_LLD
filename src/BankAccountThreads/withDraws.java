package BankAccountThreads;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class withDraws implements Callable<Void> {
    private BankAccount bankAccount;
    public withDraws(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public void withDrawing(){
        for(int i = 0; i < 100000; i++){
            bankAccount.setBalance(bankAccount.getBalance() + i);
        }
    }
    @Override
    public Void call() throws Exception {
        withDrawing();
        return null;
    }
}

package BankAccountThreads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        BankAccount bankAccount = new BankAccount(100000);
        Deposits deposits = new Deposits(bankAccount);
        withDraws withdraws = new withDraws(bankAccount);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Void> futureDeposit = executorService.submit(deposits);
        Future<Void> futureWithdraw = executorService.submit(withdraws);
        futureWithdraw.get();
        futureDeposit.get();
        System.out.println(bankAccount.getBalance());
    }
}

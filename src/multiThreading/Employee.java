package multiThreading;

public class Employee extends Thread {
    public Employee(String tname){
        super(tname);
    }
    @Override
    public void run() {
        System.out.println("Hello from Employee Thread " + Thread.currentThread().getName() + "  " + Thread.currentThread().getId());
    }
}

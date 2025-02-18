package multiThreading;

public class Manager extends Thread {
    Manager(String tname) {
        super(tname);
    }
    @Override
    public void run() {
        System.out.println("Hi from Manager Thread " +  Thread.currentThread().getName() + "  " + Thread.currentThread().getId());
    }
}

package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Employee e = new Employee("employeethread");
        e.start();
        Manager m = new Manager("managerThread");
        m.start();
        System.out.println(Thread.activeCount());
    }
}

package multiThreading;

public class TestMultiThreading {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int count = Thread.getAllStackTraces().keySet().size();
        System.out.println("Total JVM Threads: " + count);
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.getAllStackTraces().keySet().forEach(thread ->
                System.out.println(thread.getName() + " -> " + thread.getState()));
        Thread t1 = new Thread();
        t1.start();
        System.out.println(Thread.activeCount());

    }
}

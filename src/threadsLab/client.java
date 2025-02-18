package threadsLab;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client {
    public static void main(String[] args) {
       // int n = 100000;
      /*  List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(i%100);
        }
        int numThreads = Runtime.getRuntime().availableProcessors();
        System.out.println(numThreads);*/
        List<String> urls = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            urls.add("http://" + i + ":8080" + i);
        }
        ExecutorService es = Executors.newFixedThreadPool(10);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            es.execute(new webScraper(urls.get(i)));
        }
        long end = System.currentTimeMillis();
        System.out.println("Execution time for fixedThreadpool: " + (end - start));
        ExecutorService es1 = Executors.newCachedThreadPool();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            es1.execute(new webScraper(urls.get(i)));
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Execution time for cachedThreadpool: " + (end1 - start1));
    }
}

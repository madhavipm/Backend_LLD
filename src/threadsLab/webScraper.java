package threadsLab;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.Callable;

public class webScraper implements Runnable {
    private String url;
    webScraper(String url) {
        this.url = url;
    }
    @Override
    public void run() {
        try {
            //System.out.println("webScraper: " + url);
            Thread.sleep(200);
            //System.out.println("fetched the data from " + url  );
        } catch (InterruptedException e) {
            System.out.println("error while fetching the data ");
            //throw new RuntimeException(e);
        }
    }
}

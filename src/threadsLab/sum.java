package threadsLab;

import java.util.concurrent.Callable;

public class sum implements Callable<Integer> {
    public Integer input(int[] arr){
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            arr[i] /= 2;
        }
        return sum;
    }
    @Override
    public Integer call() throws Exception {

        return 0;
    }
}

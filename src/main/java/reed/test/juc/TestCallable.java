package reed.test.juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/5/15
 * @time 17:41
 */
public class TestCallable {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        FutureTask<Integer> result = new FutureTask<Integer>(td);
        new Thread(result).start();

        try {
            Integer sum = result.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }


}

class ThreadDemo implements Callable<Integer>{


    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <=100 ; i++) {
            sum += i;
        }
        return sum;
    }
}

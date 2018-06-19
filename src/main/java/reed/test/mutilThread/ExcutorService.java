package reed.test.mutilThread;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/5/25
 * @time 11:31
 */
public class ExcutorService {



    @Test
    public void testThreadPool(){
       this.test();
    }


    public  void test() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            /*executorService.execute(()->{
                        System.out.println(index);
                    }

            );*/

            /*executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index);
                }
            });*/

            try {
                Future future = executorService.submit(new Callable<Integer>() {
                   @Override
                   public Integer call() throws Exception {
                       return index;
                   }
               }

                );


                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        }


    }






}

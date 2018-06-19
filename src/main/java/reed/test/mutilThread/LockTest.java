package reed.test.mutilThread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/4/13
 * @time 16:55
 */
public class LockTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunIt());
        Thread t2 = new Thread(new RunIt());
        t1.start();
        t2.start();
        //t2.interrupt();


    }
}

class RunIt implements Runnable{

        private static Lock lock = new ReentrantLock();

        public void run() {
            try {
                lock.lock();
                //lock.lockInterruptibly();
                System.out.println(Thread.currentThread().getName()+" running");
                TimeUnit.SECONDS.sleep(5);
                lock.unlock();
                System.out.println(Thread.currentThread().getName()+" finished");


            }catch (InterruptedException e){
                System.out.println(Thread.currentThread().getName()+ " interrupted");

            }
        }
    }



